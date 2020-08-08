public class absentorpresent
{
        public static void main(String[]args)
        {
                final int  IS_FULL_TIME=1;
           final int  EMP_RATE_PER_HOUR=20;
                int emphrs=0;
                int empwage=0;
                double empcheck=Math.floor(Math.random()*10)%2;
                if(empcheck==IS_FULL_TIME)
                        {
                                emphrs=8;
                        }
                else
                                emphrs=0;
                empwage=emphrs*EMP_RATE_PER_HOUR;
                System.out.println("employee wage"+empwage);
        }

}
