class Tax{
    public static void main(String args [])
    { 
       float tax=0;
        float income=3.30f;
        if(income<=2.5){
            tax=tax+0;
        }
        else if(income>2.5 && income<=5.0f){
        tax=tax+0.05f*(income-2.5f);//tax added 5%
    }
    else if(income>5.0f && income<=10.0f){
         tax=tax+0.05f*(5.0f-2.5f);
          tax=tax+0.20f*(income-5.0f);//tax added 20%
    }
    else if(income>10.0f){
        tax=tax+0.05f*(5.0f-2.5f);
          tax=tax+0.20f*(5.0f-10.0f);
          tax=tax+0.30f*(income-10.0f);//tax added 30%
    }
      System.out.println("the income withadded tax: "+tax); 
    }
}
