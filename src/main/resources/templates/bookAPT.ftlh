<!DOCTYPE html>
<#import "/spring.ftl" as spring />
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking</title>
</head>
<body>

	<form method="post">
		<label for="customerName">Your name:</label> 
		<input type="text" name="customerName" id="customerName"placeholder="What is your name?" required> <br>
			
		<label for="date">Date of appointment:</label>
		<input type="date" name="date" id="customerName" placeholder="What is your name?" required> <br>
		
		<label for="time">Time:</time>
		<input type="time" name="time" id="time" required> <br>
	

	</form>
	<button>Save</button>
</body>
</html>