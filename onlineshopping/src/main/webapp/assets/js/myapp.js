
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
	 case 'All Products':
		 $(".active").removeClass("active");
		 $("#listProducts1").addClass("active");;
		 break;
	default:
		$('#listProducts1').class('active');
	$('#a_'+ menu).class('active');
		break;
	 }
 })
// $(document).ready(function() {
// $.each($('#navbar').find('li'), function() {
// $(this).toggleClass('active',
// window.location.pathname.indexOf($(this).find('a').attr('href')) > -1);
// });
// });
