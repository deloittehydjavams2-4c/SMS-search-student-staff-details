<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<style type="text/css">
		b{
			color:red;
		}
	</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Management System</title>
</head>
<body>
	<h3 id="display">    welcome to school management system     </h3>
	<form action="search" name="myform" method="post" onsubmit ="return(validate());">
	Select student or staff : <select name="Category" id="Category" onChange="changecat(this.value);" ><b id="txt1"></b>
	    <option value="0">Select</option>
	    <option value="Student">Student</option>
	    <option value="Staff">Staff</option>
	</select><br/>
	Select search criteria : <select name="SearchBy" id="SearchBy" ><b id="txt2"></b>
	    <option value="0" >Select</option>
	</select><br/>
	Enter search value : <input type="text" name="Values" id="Values" required>
	<script type="text/javascript">
	function validate(){
		 var e = document.getElementById("Category");
         var strUser = e.options[e.selectedIndex].value;

         var strUser1 = e.options[e.selectedIndex].text;
         
         var e1 = document.getElementById("SearchBy");
         var strUser1 = e1.options[e.selectedIndex].value;

         var strUser11 = e1.options[e.selectedIndex].text; 
         
         if(strUser==0 && strUser1==0)
         {
        	 document.getElementById("txt2").innerHTML = "field is empty";
        	 document.getElementById("txt2").innerHTML = "field is empty";
         }
         if(strUser==0){
				document.getElementById("txt1").innerHTML = "field is empty";
				document.getElementById("txt2").innerHTML = "";
				return false;
			}else{
				document.getElementById("txt1").innerHTML = "";
			}
			if( strUser1==0){
				document.getElementById("txt2").innerHTML = "field is empty";
				return false;
			}else{
				document.getElementById("txt1").innerHTML = "";
			}
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
	<br/>
	<input type="submit" value="search">
	</form>
</body>
</html>