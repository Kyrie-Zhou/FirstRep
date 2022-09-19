public class BroadCastRecv extends BroadCastReceiver{
    public void onReceive(Context context, Intent intent){
      Toast.make(this,"这是第一个广播接受器",LENGTH_LONG);
    }
}
