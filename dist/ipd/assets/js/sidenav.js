document.addEventListener("DOMContentLoaded", function(event) {
  setTimeout(() => {
let arrow = document.querySelectorAll(".arrows"); 
let arrows = document.querySelectorAll(".openMainMenus"); 
var arrowNested = document.querySelectorAll(".arrow_nested");
let arrowNesteds = document.querySelectorAll(".openSubMenus");
for (var i = 0; i < arrow.length; i++) {

 arrow[i].addEventListener("click", (e)=>{
 let arrowParent = e.target.parentElement.parentElement.parentElement;//selecting main parent of arrow
   arrowParent.classList.toggle("showMenu");
  });
} 

// for (var i = 0; i < arrows.length; i++) {
//    arrows[i].addEventListener("click", (e)=>{
//      let arrowParents = e.target.parentElement.parentElement.parentElement.parentElement;//selecting main parent of arrow
//      arrowParents.classList.toggle("showMenu");
//       });
//  } 


// for (var j = 0; j < arrowNested.length; j++) {
//   arrowNested[j].addEventListener("click", (e)=>{
//     let arrowParent = e.target.parentElement.parentElement.parentElement;//selecting main parent of arrow
//     console.log(arrowParent,"arrowParent")
//       arrowParent.classList.toggle("showSubMenu");
//      });
// }

for (var j = 0; j < arrowNesteds.length; j++) {
  arrowNesteds[j].addEventListener("click", (e)=>{
    let arrowParent = e.target.parentElement.parentElement.parentElement;//selecting main parent of arrow
      arrowParent.classList.toggle("showSubMenu");
     });
}

  }, 2000);

  let sidebar = document.querySelector(".sidebar");
  let sidebarBtn = document.querySelector(".bx-menu");
  let home_section = document.querySelector(".home-section");
  let head =  document.querySelector(".headers");
  
  console.log(window.screen.availWidth,"screen width");
  if(window.screen.availWidth<=991){
    sidebar.classList.add("closed");
    home_section.classList.add("closed");
    head.classList.add("closed");
  
  }
  if(sidebarBtn){
sidebarBtn.addEventListener("click", ()=>{
  sidebar.classList.toggle("closed");
  home_section.classList.toggle("closed");
  head.classList.toggle("closed");
});}
});
