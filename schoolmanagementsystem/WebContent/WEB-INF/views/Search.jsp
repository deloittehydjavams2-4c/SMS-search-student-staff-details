<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Management System</title>
</head>
<body>

<div>
  <form action="search" name="myform" method="post" onsubmit ="return validate()">
  <h3 id="display">    Welcome to School Management System     </h3>
    <label for="Category">Select student or staff :</label>
    <select name="Category" id="Category" onChange="changecat(this.value);" class="required"><b id="txt1"></b>
	    <option value="Select">Select</option>
	    <option value="Student">Student</option>
	    <option value="Staff">Staff</option>
	</select><br/>

    <label for="SearchBy">Select search criteria :</label>
	 <select name="SearchBy" id="SearchBy" class="required"><b id="txt2"></b>
		    <option value="Select" >Select</option>
		</select><br/>

    <label for="Values">Enter search value : </label>
    <input type="text" name="Values" id="Values" required>
  
    <input type="submit" value="Submit">
  </form>
</div>

	<script type="text/javascript">
	function validate()
	{
		if(document.form.Category.selectedIndex=="" || document.form.SearchBy.selectedIndex=="")
		{
			alert ( "Please select !");
			return false;
		}
		return true;
	}
	var mealsByCategory = {
		    Student: ["Standard"],
		    Staff: ["Experience", "Salary", "highest_qualification", "Designation"],
		}

	function changecat(value) {
		 if (value.length == 0) document.getElementById("SearchBy").innerHTML = "<option></option>";
		     else {
		            var catOptions = "";
		            for (categoryId in mealsByCategory[value]) {
		                catOptions += "<option>" + mealsByCategory[value][categoryId] + "</option>";
		            }
		            document.getElementById("SearchBy").innerHTML = catOptions;
		        }
		    }
	</script>

</body>
</html>