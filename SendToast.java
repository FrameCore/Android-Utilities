    public static void sendToastMsg(String text, Context context) {
        @SuppressLint("ShowToast") Toast toast = Toast.makeText(context, null, Toast.LENGTH_LONG);
        toast.setText(text);
        toast.show();
    }