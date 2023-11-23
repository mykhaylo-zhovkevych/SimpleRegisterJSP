<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Employee Register Form</title>
  <style>
    body {
      font-family: 'Arial', sans-serif;
      background-color: #f5f5f5;
      margin: 0;
      padding: 0;
      display: flex;
      align-items: center;
      justify-content: center;
      height: 100vh;
    }

    .container {
      background-color: #fff;
      padding: 20px;
      border-radius: 10px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    h1 {
      color: #333;
      text-align: center;
    }

    table {
      width: 80%;
      margin: 20px auto;
      border-collapse: collapse;
    }

    td {
      padding: 10px;
    }

    input[type="text"],
    input[type="password"] {
      width: 100%;
      padding: 8px;
      box-sizing: border-box;
      margin-bottom: 10px;
    }

    .center-button {
      text-align: center;
    }

    input[type="submit"] {
      background-color: #4caf50;
      color: #fff;
      padding: 10px 15px;
      border: none;
      border-radius: 5px;
      cursor: pointer;
    }

    input[type="submit"]:hover {
      background-color: #45a049;
    }
  </style>
</head>
<body>
  <div class="container">
    <h1>Employee Register Form</h1>
    <form action="<%= request.getContextPath() %>/register" method="post">
      <table>
        <tr>
          <td>First Name</td>
          <td><input type="text" name="first_name" /></td>
        </tr>
        <tr>
          <td>Last Name</td>
          <td><input type="text" name="last_name" /></td>
        </tr>
        <tr>
          <td>UserName</td>
          <td><input type="text" name="username" /></td>
        </tr>
        <tr>
          <td>Address</td>
          <td><input type="text" name="address" /></td>
        </tr>
        <tr>
          <td>Contact No</td>
          <td><input type="text" name="contact" /></td>
        </tr>
        <tr>
          <td>Password</td>
          <td><input type="password" name="password" /></td>
        </tr>
      </table>
      <div class="center-button">
        <input type="submit" value="Submit" />
      </div>
    </form>
  </div>
</body>
</html>

