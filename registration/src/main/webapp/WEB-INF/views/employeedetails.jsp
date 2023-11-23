<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Upload Success</title>
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
            text-align: center;
        }

        h1 {
            color: #4caf50;
        }
    </style>
    <script>
        // JavaScript to redirect after 3 seconds
        setTimeout(function () {
            window.location.href = "/registration/register";
        }, 3000);
    </script>
</head>
<body>
    <h1>Successfully uploaded</h1>
    <p>You will be redirected shortly...</p>
</body>
</html>
