
var files=[];
$("#image").change(function(event){
	files = event.target.files;
	forms = new FormData();   
	forms.append("file",files[0]);
	 $.ajax({
         url: '/Shop/upload/productImg',
         type: 'post',
         contentType: false,
         data: forms,
         enctype: 'multipart/form-data',
         processData:false,
         
   		success: function(){
   		
       		}
   		
     });
	 
});