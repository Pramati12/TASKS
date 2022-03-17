let obj =[ 
        {
         msg:"breakfast",
         status: false
       },
       {
         msg:"lunch",
         status: false
       },
       {
         msg:"dinner",
         status: false
       },
            
  ]




  window.onload = function() {
    header();
    displayData();
  };
  


const header = ()=>{
  var maindiv = document.createElement('div');
  maindiv.className = 'block';
  document.body.appendChild(maindiv);

    
    const heading = document.createElement("h2");
    heading.className = "heading"
    heading.innerText = "List of todo tasks : " 
    maindiv.appendChild(heading)
   
    const span = document.createElement("span");
    span.id = "span"
    span.innerText =  obj.length; 
    heading.appendChild(span)

    

    const inp = document.createElement("input");
    inp.placeholder = "Title... " 
    inp.className= "inpbox"
    inp.id = "inpValue"
    
    maindiv.appendChild(inp);

    const btn = document.createElement("button");
    btn.textContent = "Add Activity"
    btn.className = "btn"
    btn.type="submit";
    btn.addEventListener("click",createNewElement)
    maindiv.appendChild(btn)


}



 
  





  async  function createNewElement() {

      
      var inputValue = document.getElementById("inpValue").value;

      if(inputValue){

        var cont = document.createElement('div');
        cont.className = 'cont';
        document.body.appendChild(cont);

        const label  = document.createElement("label");
        label.innerHTML = inputValue;
        label.className = "labclass"

        const chkbox  = document.createElement("input");
        chkbox.type = "checkbox"


        chkbox.checked = false;
      
        chkbox.innerText = inputValue;


      


        cont.appendChild(chkbox);
        cont.appendChild(label)


        obj.push({
          msg:inputValue,
          status:false
        });

        

        let length = obj.length;

        console.log(length);
        span.innerText =  obj.length; 
        

      } else {
        alert("give the list items")
      }

     
    }

  

  displayData = () =>{
    
    obj.map((i)=>{

      var cont = document.createElement('div');
      cont.className = 'cont';
      document.body.appendChild(cont);
    
  
      const label  = document.createElement("label");
      label.innerHTML = i.msg;
      label.className = "labclass"

      const chkbox  = document.createElement("input");
      chkbox.type = "checkbox"

      if((i.status === true ) || (i.msg ==='breakfast')) {
          chkbox.checked = true;
      } else {
          chkbox.checked = false;
      }

      chkbox.innerText = i.msg;
      cont.appendChild(chkbox);
      cont.appendChild(label)

     

 })


  }


    

    

    

