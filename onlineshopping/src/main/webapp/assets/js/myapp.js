
$(document).ready(function(){ 
	 // solving the active menu problem
	 switch(menu){
	 
	 case 'About Us':
		  $(".active").removeClass("active");
		  $("#about1").addClass("active");
		 break;

	 case 'Contact Us':
		 $(".active").removeClass("active");
		 $("#contact1").addClass("active");;
		 break;
	default:
		$('#home1').class('active');
	 }
 })
//$(document).ready(function() {
//    $.each($('#navbar').find('li'), function() {
//        $(this).toggleClass('active', 
//            window.location.pathname.indexOf($(this).find('a').attr('href')) > -1);
//    }); 
//});