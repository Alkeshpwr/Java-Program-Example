
class myRunnable implements Runnable
{
public void run()
{
  for(int i=0;i<10;i++)
{
   System.out.println("child thread");
}

}
}

  class ThreadDemo1
{
public static void main(String args[])
{
myRunnable r=new myRunnable();
Thread t1=new Thread();
Thread t2=new Thread(r);
r.start();

for(int i=0;i<10;i++)
{
System.out.println("main thread");
}
}
}