class array
{
    public static void main(String[] args)
    {
        long [] arr; //reference to array
        arr = new long[100]; //make array
        int nElems = 0; // number of items
        int j; // loop 
        long searchKey; // key of item to search for

        arr[0] = 34;   //insert 10 items
        arr[1] = 64;
        arr[2] = 58;
        arr[3] = 92;
        arr[4] = 25;
        arr[5] = 00;
        arr[6] = 37;
        arr[7] = 84;
        arr[8] = 70;
        arr[9] = 16;
        nElems = 10;

        for(j = 0; j<nElems; j++)
        {
            System.out.print(arr[j] + " ");
            System.out.println("");
        }

        searchKey = 58;  //to find item with key 58
        for(j=0; j<nElems; j++)
        {
            if(arr[j] == searchKey)
            break;
            if(j == nElems)
           { System.out.print("Can't find " + searchKey);
            System.out.println(" ");
           }
            else {
            System.out.print("Found " + searchKey);
            System.out.println("");
            }
        }




        searchKey = 84;    //delete item with key 84
        for(j = 0; j<nElems; j++) 
        {
            if(arr[j] == searchKey)
            break;
        }
            for(int k = j; k<nElems; k++)
            {
            arr[k] = arr[k+1];
            nElems--;
            }






            for(j = 0; j<nElems; j++)
            System.out.print(arr[j] + " ");
             System.out.println("");
            
    }
}




