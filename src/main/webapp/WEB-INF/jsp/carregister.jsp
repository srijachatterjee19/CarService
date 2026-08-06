<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Car Service Registration</title>
    <style>
        body { font-family: Arial, sans-serif; max-width: 500px; margin: 40px auto; padding: 0 20px; }
        h2 { color: #333; }
        label { display: block; margin-top: 12px; font-weight: bold; }
        input[type="text"], textarea {
            width: 100%; padding: 8px; margin-top: 4px;
            border: 1px solid #ccc; border-radius: 4px; box-sizing: border-box;
        }
        button { margin-top: 20px; padding: 10px 24px; background-color: #4CAF50; color: white;
                 border: none; border-radius: 4px; cursor: pointer; font-size: 16px; }
        button:hover { background-color: #45a049; }
    </style>
</head>
<body>
    <h2>Car Service Registration</h2>
    <form:form action="/done" method="post" modelAttribute="car">
        <label for="registerationNumber">Car Registration Number:</label>
        <form:input path="RegisterationNumber" id="registerationNumber" placeholder="e.g. MH12AB1234" />

        <label for="carName">Owner / Car Name:</label>
        <form:input path="CarName" id="carName" placeholder="e.g. John Doe / Honda City" />

        <label for="carDetails">Warranty Coverage / Remarks:</label>
        <form:input path="CarDetails" id="carDetails" placeholder="e.g. Under warranty till Dec 2025" />

        <label for="carWork">Work to be Done:</label>
        <form:input path="CarWork" id="carWork" placeholder="e.g. Oil change, brake inspection" />

        <button type="submit">Submit</button>
    </form:form>
</body>
</html>
