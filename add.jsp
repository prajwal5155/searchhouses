<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>

<style type="text/css">

.alert-success {

    padding: 50px;
    margin: 50px;
    --bs-alert-color: var(--bs-success-text-emphasis);
    --bs-alert-bg: var(--bs-success-bg-subtle);
    --bs-alert-border-color: var(--bs-success-border-subtle);
    --bs-alert-link-color: var(--bs-success-text-emphasis);
}



</style>

</head>
<body>

<%   int count=(int)request.getAttribute("finalcount"); %>



<div class="alert alert-success" role="alert">
  <h4 class="alert-heading">Note</h4>
  <p><%=count %>.Registration successfull your information and licence will be check by Authority after that only your registration will approve it will take some time. </p>
  <hr>
  <p class="mb-0">2.Thank you so much</p>
  <br><br>
  <a href="index.html">
  <input type="button" value="Back">
  </a>
</div>

</body>
</html>