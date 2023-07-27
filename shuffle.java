class Solution {
    public String restoreString(String s, int[] a) {

    //    int []a = {4,5,6,7,0,2,1,3};
		String string="";
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==a[j])
				{
					string =string+s.charAt(j);
				}
			}
		}
        return string;
    }
}