public class simpleStuff
{
    public static int someStuff(boolean tf)
    {
        if (tf)
            return 10;
        else
            return 5;
    }//end of method someStuff
    public static int binarySearch(int target, int[] intArr)
    {
        int index = -1;
        if(intArr.length >= 1)
        {
            index = intArr.length / 2;
            int max = intArr.length;
            int min = 0;
            boolean targetFound = false;
            while(!targetFound && (index != min && index != max))
            {
                if (intArr[index] < target)
                {
                    min = index;
                    index = (min + max)/2;
                }
                else if (intArr[index] > target)
                {
                    max = index;
                    index = (max + min)/2;
                }
                else if (intArr[index] == target)
                {
                    targetFound = true;
                }
            }
            if(intArr[index] == target)
            {
                targetFound = true;
            }
            if(!targetFound)
            {
                index = -1;
            }
        }
        return index;
    }//end of binary search
    public static int linearSearch(int target, int[] intArr)
    {
        int i = 0;
        if(intArr.length >= 1)
        {
            boolean targetFound = false;
            while(!targetFound)
            {
                if(intArr[i] == target) {
                    targetFound = true;
                }
                i++;
            }
        }
        return i -1;
    }
}//end of class simpleStuff
