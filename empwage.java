public class empwage 
{
        public static void main(String[]args)
        {
                final int  IS_FULL_TIME=1;
           final int  EMP_RATE_PER_HOUR=20;
                final int  IS_PART_TIME=2;
                int emphrs=0;
                int empwage=0;
                double empcheck=Math.floor(Math.random()*10)%3;
                if(empcheck==IS_FULL_TIME)
                        {
                                emphrs=8;
                        }
                else if(empcheck==IS_PART_TIME)
                        {
                                emphrs=4;
                        }
                else
                                emphrs=0;
                empwage=emphrs*EMP_RATE_PER_HOUR;
                System.out.println("employee wage"+empwage);
        }

}
