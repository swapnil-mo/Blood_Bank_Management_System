<%@page import="Model.ActivityModel"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap-source/bootstrap.min.css" >
</head>
<body>
<h2 class="text-center">Activity Management</h2>
<form action="ActivityController" method="get">
<p class="text-end"> <button type="submit" class="p-2 me-3 btn btn-dark">Add Activity</button></p>
</form>

<table class="mx-auto mt-3 table  table table-bordered data-table" id="data" >
<thead> <tr> <th scope="col">Activity Name </th>  <th scope="col">Performed Date </th>  <th scope="col">Admin Name </th> </tr> </thead>

<tbody>

<%
HttpSession session2 = request.getSession(true);

ArrayList<ActivityModel> allAct = (ArrayList<ActivityModel>) session2.getAttribute("allAct");
%>

<%
if(allAct != null)
{
	for(ActivityModel act_obj : allAct)
	{
%>
  
	<tr>
	<form action="Get_all_activity" method="post" >
	   
	<td> <input type="text" name="A_name" disabled class="w-100" value="<%=act_obj.getActivity_name() %>" >  </td> 
	<td> <input type="text" name="P_date" class="w-100" disabled value="<%= act_obj.getPerformed_at()%>" >  </td> 
	<td> <input type="text" name="A_id" class="w-100" disabled value="<%= act_obj.getAdmin_id()%>" >  </td> 
	
	
	<td>
         
                <!-- Hidden input to store the service_id for each row -->
                <input    type="hidden" name="L_id" value="<%= act_obj.getLog_id() %>" >
               
                <!-- Update button with onclick event -->
                <input class="btn btn-info btn-update" hidden type="submit" value="Update"  name="but"  > 
               <button type="button"  name="edit" class=" btn btn-edit btn-success">Edit</button>
                
                
         <!-- <input class="btn btn-delete"  type="submit" value="Delete"  name="but"  > 
                 Delete button -->
                <input class="btn btn-danger btn-remove" type="submit" value="Delete" name="but">
          
        </td>
        </form>
	</tr>
  
<% 		
	}
	
}
else
{
	out.print("table data not found");
}

%>


<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js">  </script>

 <script type="text/javascript">
	
	
    $("body").on("click",".btn-delete",function(){
        $(this).parents("tr").remove();
    })

    $("body").on("click",".btn-edit",function(){
        
        
        console.log($(this).parents('tr'));
              
             
                	
               var activity_name = $(this).parents('tr').find('input[name="A_name"]').val();
               var performed_date =   $(this).parents('tr').find('input[name="P_date"]').val();
               var admin_id =$(this).parents('tr').find('input[name="A_id"]').val();
               
              
               
                console.log(activity_name );
                console.log(performed_date);
                console.log(admin_id);
                
              
                $(this).parents('tr').find('input[name="A_name"]').removeAttr("disabled");
                 $(this).parents('tr').find('input[name="P_date"]').removeAttr("disabled");
               
                 $(this).parents('tr').find('input[name="A_id"]').removeAttr("disabled");
                $(this).parents('tr').find('.btn-update').removeAttr("hidden"); 
                
               
 $(this).parents("tr").find("td:eq(3)").prepend("<button  class='btn btn-warning btn-xs btn-cancel'> cancel</button> ");
        $(this).hide();
        $('.btn-update').show();
       
        
    })

    $("body").on('click','.btn-cancel',function(){
       
    	 /* var service_image =  $(this).parents('tr').find('input[name="image"]').val(); */
    	
				  $(this).parents('tr').find('input[name="E_name"]').attr("disabled", "true");
                 $(this).parents('tr').find('input[name="A_date"]').attr("disabled", "true");
               
                 $(this).parents('tr').find('input[name="A_id"]').attr("disabled","true");

                

                
              
        
       $(this).remove();
       $('.btn-update').hide();
       $('.btn-edit').show();

    })

    $("body").on('click','.btn-update',function(){
        
      
         $(this).hide(); 
        $('.btn-cancel').remove();
        $('.btn-edit').show();
    })

 
/* ***************************** pagination ************************ */
 
 
	 $(document).ready (function () {  
    $('#data').after ('<div id="nav" class="text-center"></div>');  
    var rowsShown = 6;  
    var rowsTotal = $('#data tbody tr').length;  
    var numPages = rowsTotal/rowsShown;  
    for (i = 0;i < numPages;i++) {  
        var pageNum = i + 1;  
        $('#nav').append (`<a href="#" class="btn btn-dark " rel=${i}>${pageNum}</a> `);  
    }  
   $('#data tbody tr').hide();  
    $('#data tbody tr').slice (0, rowsShown).show();  
    $('#nav a:first').addClass('active');  
   $('#nav a').bind('click', function() {  
    // $('#nav a').removeClass('active');  
      //$(this).addClass('active');  
        var currPage = $(this).attr('rel');  
         var startItem = currPage * rowsShown;  
         var endItem = startItem + rowsShown;  
         $('#data tbody tr').css('opacity','0.0').hide().slice(startItem, endItem).  
         css('display','table-row').animate({opacity:1}, 300);  
     });  
});  

</script>

</body>
</html>