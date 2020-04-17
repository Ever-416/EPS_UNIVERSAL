package Splash;
import javax.swing.JProgressBar;
import Formularios.Login;


public class HiloProgreso  extends Thread{
JProgressBar Progreso;
   
       public HiloProgreso(JProgressBar progreso1)
    {        
        super();
        this.Progreso=progreso1;
    }
       public void run()
{
    for(int i=1;i<=100;i++)
    {
        Progreso.setValue(i);
        pausa(100);
    }
   
}
       public void pausa(int mlSeg)
{
    try
    {
        // pausa para el splash
        Thread.sleep(mlSeg);
    }catch(Exception e){}
}
}
