class Like1
{
static String like(String[] name)
{
 int num=name.length;
 
   if(num==0)
   {
	   return "no one like";
   }
   else if(num==1)
   {
	   for(int i=0;i<num;i++)
	   {
		   if(name[i]=="peter")
		   {
			   return "peter like this";
		   }
		    else{
			   return "not proper names";
		   }
		  
	   }
	  
   }
   else if(num==2)
   {
	   for(int j=0;j<num;j++)
	   {
		   if(name[j]=="jacob"&& name[j+1]=="alex")
		   {
			   return "jacob and alex like this";
		   }
		    else{
			   return "not proper names";
		   }
		  
	   }
	   
   
}

else if(num==3)
   {
	   for(int k=0;k<num;k++)
	   {
		   if(name[k]=="max"&& name[k+1]=="john" && name[k+2]=="mark")
		   {
			   return "max john and mark like this";
		   }
		   else{
			   return "not proper names";
		   }
		  
	   }
	   
   
}
else if(num==4)
   {
	   for(int m=0;m<num;m++)
	   {
		   if(name[m]=="alex"&& name[m+1]=="jacob" && name[m+2]=="mark" && name[m+3]=="max")
		   {
			   return "alex jacob and 2 others like this";
		   }
		    else{
			   return "not proper names";
		   }
		  
	   }
	   
   
}

else 
   {
	  return "no likes";
   }
   return "";
}
}