package HW.les9;
/* Перехват checked исключений
В методе processExceptions обработайте все checked исключения.
IOException
RemoteException
NoSuchFieldException
Нужно вывести на экран каждое возникшее checked исключение.
Можно использовать только один блок try..
*/

import java.io.IOException;
import java.rmi.RemoteException;

public class Interception {
    public static void main(String[] args) {

        processExceptions(new Interception());
    }
        public static void processExceptions (Interception ob) {;
            try {
                ob.start1();
                ob.start2();
                ob.start3();
            } catch (RemoteException ex) {
                System.out.println(ex);
            }catch (IOException ex) {
                System.out.println(ex);
            }catch (NoSuchFieldException ex) {
                System.out.println(ex);
            }
        }

    public void start1() throws IOException {
        throw new IOException();
    }
    public void start2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }
    public void start3() throws RemoteException {
        throw new RemoteException();
    }

}
