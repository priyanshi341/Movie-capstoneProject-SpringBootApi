$(document).ready(function(){
  console.log('ddd');
    $('ul.navbar-nav li.dropdown').hover(function() {        
      $(this).find('.dropdown-menu').stop(true, true).delay(200).fadeIn(500);
    }, function() {
      $(this).find('.dropdown-menu').stop(true, true).delay(200).fadeOut(500);
    });
    });
