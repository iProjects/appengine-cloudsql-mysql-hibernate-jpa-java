package com.google.appengine.demos;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.utils.SystemProperty;

/**
 * Servlet implementation class MakeOffersServlet
 */
public class MakeOffersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MakeOffersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HandleRequest( request,  response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HandleRequest( request,  response);
	}
	
	public void HandleRequest(HttpServletRequest req, HttpServletResponse res)
		      throws IOException {
		    res.setContentType("text/plain");

		    Map<String, String> properties = new HashMap();
		    if (SystemProperty.environment.value() ==
		          SystemProperty.Environment.Value.Production) {
		      properties.put("javax.persistence.jdbc.driver",
		          "com.mysql.jdbc.GoogleDriver");
		      properties.put("javax.persistence.jdbc.url",
		          System.getProperty("cloudsql.url"));
		    } else {
		      properties.put("javax.persistence.jdbc.driver","com.mysql.jdbc.Driver");
		      properties.put("javax.persistence.jdbc.url",System.getProperty("cloudsql.url.dev"));
		      properties.put("javax.persistence.jdbc.user",System.getProperty("cloudsql.user.dev"));
		      properties.put("javax.persistence.jdbc.password",System.getProperty("cloudsql.password.dev"));
		    }

		    EntityManagerFactory emf = Persistence.createEntityManagerFactory(
		            "fanikiwa", properties);

		        // Insert Offer to DB. 
		        Offer offer=new Offer();
		        offer.setDescription(req.getParameter("Description"));
		        offer.setPublicOffer(req.getParameter("PublicOffer"));
		        offer.setOfferType(req.getParameter("OfferType"));
//		        offer.setAmount(req.getParameter("Amount"));
//		        offer.setTerm(req.getParameter("Term"));
//		        offer.setInterest(req.getParameter("Interest"));
//		        offer.setPartialPay(req.getParameter("PartialPay")); 
		        
		        EntityManager em = emf.createEntityManager();
		        em.getTransaction().begin();
		        em.persist(offer);

		        em.getTransaction().commit();
		        em.close();

		        // List all the rows.
		        em = emf.createEntityManager();
		        em.getTransaction().begin();
		        List<Offer> result = em
				        .createQuery("FROM Offers", Offer.class)
				        .getResultList();
				    for (Offer g : result) {
				    	 res.getWriter().println(
						 g.getId() + " " + g.getOfferType() + " "  + g.getDescription()
						  + "<a href=upate?" + g.getId() + ">Update </>");
		        }
		        em.getTransaction().commit();
		        em.close();

		      }
		    }

