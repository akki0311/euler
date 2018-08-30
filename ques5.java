class small
{
	public static void main(String[] args) {
		long c = 21;
while (1==1)
{
    boolean  small = true;
    for (int i = 1; i < 21; i++)
    {
        small = true;
        if ( c % i != 0 )
        {
            small = false;
            break;
        }
    }
    if ( small )
    {
        System.out.println( c );
        System.exit(0);
    }

    c++;
}

			
		}
	}