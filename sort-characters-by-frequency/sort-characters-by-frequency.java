class Solution {

    public String frequencySort(String s) {
        
    	char str[]=s.toCharArray();
    	int arr[][]=new int[52][2];
    	for(int i=0;i<str.length;i++)
    	{
            if(str[i]-'a'>=0) 
            {
                arr[str[i]-'a'][0]=str[i];
    		    arr[str[i]-'a'][1]++;
            }
            else
            {
                arr[str[i]-'A'+26][0]=str[i];
    		    arr[str[i]-'A'+26][1]++;
            }
    	}
    	Arrays.sort(arr,(o1,o2)->o2[1]-o1[1]);
    	StringBuilder ans=new StringBuilder();
    	for(int i=0;i<52;i++)
    	{
    		if(arr[i][1]==0)
    			break;
    		for(int j=0;j<arr[i][1];j++)
    			ans.append((char)arr[i][0]);
    	}
    	return ans.toString();
    }
}