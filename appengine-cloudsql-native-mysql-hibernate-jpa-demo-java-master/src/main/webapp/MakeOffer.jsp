<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Make Offer</title>
</head>
<body>
 <form action="/makeoffer" method="post">
    Description : <input type="text" name="Description" id="Description"/> <br/>
    PublicOffer : <input type="text" name="PublicOffer" id="PublicOffer"/> <br/>
    OfferType : <input type="text" name="OfferType" id="OfferType"/> <br/>
    Amount : <input type="number" name="Amount" id="Amount"/> <br/>
    Term : <input type="number" name="Term" id="Term"/> <br/>
    Interest : <input type="number" name="Interest" id="Interest"/> <br/>
     PartialPay : <input type="checkbox" name="PartialPay" id="PartialPay"/> <br/>
    <input type="submit" value="Submit"/>
 </form>
</body>
</html>