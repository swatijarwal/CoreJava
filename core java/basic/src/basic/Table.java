package basic;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] table=new int[10][10];
		int i,j=0;
		for(i=0;i<table.length;i++)
		{
		 for(j=0; j<table.length; j++)
		 {
			 table [i][j]=(i+1)*(j+1);
		 }
		}
        for(i=0;i<table.length;i++)
        {
        	for(j=0; j<table.length; j++)
        	{
        		System.out.println(table[i][j]+"\t");
        	}
        	System.out.println( );
        }
	}

}
