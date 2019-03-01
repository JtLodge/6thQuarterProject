<%-- 
    Document   : Register
    Created on : Feb 15, 2019, 3:23:34 PM
    Author     : Ian
--%>
<%@page import="java.sql.*"%>
<%@page import="Connector.Connector"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
    <head>
        <title>Login</title>


        <link rel="stylesheet" href="css/styles.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">	
    </head>
    <body class= "loginbody">

        <div class ="container-fluid">
            <form class="form-signin" method="post" action="Register.jsp">
                <img src="images/logo.png" width="290" height="72">

                <h1 class="hcolor h3 mb-3 font-weight-normal">Register</h1>

                <label for="inputEmail" class="sr-only">Email</label>
                <input type="username" name="email" id="inputEmail" class="form-control" placeholder="Email" required autofocus name='username'>

                <label for="inputID" class="sr-only">Driver Id</label>
                <input type="username" name="id" id="inputDriverId" class="form-control" placeholder="Driver ID" required autofocus name='username'>

                <label for="inputName" class="sr-only">First Name</label>
                <input type="username" name="fName" id="inputFName" class="form-control" placeholder="First Name" required autofocus name='username'>

                <label for="inputName" class="sr-only">Last Name</label>
                <input type="username" name="Lname" id="inputLName" class="form-control" placeholder="Last Name" required autofocus name='username'>

                <label for="inputPassword" class="sr-only">Password</label>
                <input type="password" name="password" id="inputPassword" class="form-control" placeholder="Password" required name='userpassword'>
                <div class="checkbox mb-3 cbcolor">
                    <label>
                        <input type="checkbox" value="remember-me"> Remember me
                    </label>
                </div>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
                <p class="mt-5 mb-3 fcolor">&copy; 2017-2018</p>
            </form>

        </div>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>

    </body>

    <%

        Connector con = new Connector(null, null, null);
        PreparedStatement prepstate = null;
        con.startConnection();

        String Email = request.getParameter("email");
        String ID = request.getParameter("id");
        String Fname = request.getParameter("fName");
        String Lname = request.getParameter("lName");
        String Password = request.getParameter("password");
        prepstate = con.getPrepState("insert into users (driverID, email, fName, lName, password) values(?,?,?,?,?);");

        prepstate.setString(1, ID);
        prepstate.setString(2, Email);
        prepstate.setString(3, Fname);
        prepstate.setString(4, Lname);
        prepstate.setString(5, Password);

        con.insertQuery(prepstate);
        
        con.stopConnection();


    %> 
</html>