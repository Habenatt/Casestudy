<jsp:include page="../include/header.jsp" />

<form method="get"  action="/registration-url-path/registerSubmit">

    <label for="fname" style="width: 14%;"  > <b>First name:</b></label>
    <input type="text" id="fname" name="firstName" placeholder="Enter your First name"><br>
    <label for="lname" style="width: 14%;" > <b>Last name:</b></label>
    <input type="text" id="lname" name="lastName" placeholder="Enter your Last name"><br>
    <label for="email" style="width: 14%;"><b>email:</b></label>
    <input type="text" id="email" name="email" placeholder="Enter your email"><br>
    <label for="pass" style="width: 14%;"><b>Password:</b></label>
    <input type="text" id="pass" name="password" placeholder="Enter your Password"><br>
    <label for="Cpass" style="width: 14%;"><b>confirm Password:</b></label>
    <input type="text" id="Cpass" name="confirmPassword" placeholder="Confirm your Password"><br>
    <input id="add" type="submit" name="submit"  value="Register" /><br>



</form>


<jsp:include page="../include/footer.jsp" />