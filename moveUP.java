    public static void moveUP(final View view, final float p1, final float p2) {
        TranslateAnimation animation = new TranslateAnimation(
                Animation.ABSOLUTE, 0f,
                Animation.ABSOLUTE, 0f,
                Animation.ABSOLUTE, p1,
                Animation.ABSOLUTE, p2);

        animation.setInterpolator(new OvershootInterpolator());
        animation.setDuration(600);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                int left = view.getLeft();
                int top = view.getTop()+(int)(p2-p1);
                int width = view.getWidth();
                int height = view.getHeight();

                view.clearAnimation();
                view.layout(left, top, left+width, top+height);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        /*
        view.setVisibility(View.VISIBLE);
        view.animate().alpha(1f)
                .setDuration(600)
                .setListener(null);*/

        view.startAnimation(animation);
    }
