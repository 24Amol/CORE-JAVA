//QNO8:-Write A Program To Print All The Lowercase Characters Into Integer Format

class PrintAllLowerCaseCharToInt 
{
	public static void main(String[] args) 
	{
		int num=96;
		
		while(num<122)
		{				
			char ch=(char)num;
			num++;
			ch++;		
			System.out.println(ch);
		}

	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>a
-->>b
-->>c
-->>d
-->>e
-->>f
-->>g
-->>h
-->>i
-->>j
-->>k
-->>l
-->>m
-->>n
-->>o
-->>p
-->>q
-->>r
-->>s
-->>t
-->>u
-->>v
-->>w
-->>x
-->>y
-->>z
*************************************************/