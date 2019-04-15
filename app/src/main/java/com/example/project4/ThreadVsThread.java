package com.example.project4;
import android.content.pm.PackageInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;


public class ThreadVsThread extends AppCompatActivity {

    private HandlerThread worker1 = new HandlerThread("Thread1");
    private HandlerThread worker2 = new HandlerThread("Thread2");
    private int guess1;
    private int guess2 = 0;
    private int solution;
    private ArrayList<Integer> guesses = new ArrayList<>();
    public ArrayList<Integer> oneAway = new ArrayList<>();
    public ArrayList<Integer> twoAway = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread_vs_thread);

        final TextView p1Text = findViewById(R.id.p1Text);
        final TextView p2Text = findViewById(R.id.p2Text);

        ImageView img0 = findViewById(R.id.img0);
        ImageView img1 = findViewById(R.id.img1);
        ImageView img2 = findViewById(R.id.img2);
        ImageView img3 = findViewById(R.id.img3);
        ImageView img4 = findViewById(R.id.img4);
        ImageView img5 = findViewById(R.id.img5);
        ImageView img6 = findViewById(R.id.img6);
        ImageView img7 = findViewById(R.id.img7);
        ImageView img8 = findViewById(R.id.img8);
        ImageView img9 = findViewById(R.id.img9);
        ImageView img10 = findViewById(R.id.img10);
        ImageView img11 = findViewById(R.id.img11);
        ImageView img12 = findViewById(R.id.img12);
        ImageView img13 = findViewById(R.id.img13);
        ImageView img14 = findViewById(R.id.img14);
        ImageView img15 = findViewById(R.id.img15);
        ImageView img16 = findViewById(R.id.img16);
        ImageView img17 = findViewById(R.id.img17);
        ImageView img18 = findViewById(R.id.img18);
        ImageView img19 = findViewById(R.id.img19);
        ImageView img20 = findViewById(R.id.img20);
        ImageView img21 = findViewById(R.id.img21);
        ImageView img22 = findViewById(R.id.img22);
        ImageView img23 = findViewById(R.id.img23);
        ImageView img24 = findViewById(R.id.img24);
        ImageView img25 = findViewById(R.id.img25);
        ImageView img26 = findViewById(R.id.img26);
        ImageView img27 = findViewById(R.id.img27);
        ImageView img28 = findViewById(R.id.img28);
        ImageView img29 = findViewById(R.id.img29);
        ImageView img30 = findViewById(R.id.img30);
        ImageView img31 = findViewById(R.id.img31);
        ImageView img32 = findViewById(R.id.img32);
        ImageView img33 = findViewById(R.id.img33);
        ImageView img34 = findViewById(R.id.img34);
        ImageView img35 = findViewById(R.id.img35);
        ImageView img36 = findViewById(R.id.img36);
        ImageView img37 = findViewById(R.id.img37);
        ImageView img38 = findViewById(R.id.img38);
        ImageView img39 = findViewById(R.id.img39);
        ImageView img40 = findViewById(R.id.img40);
        ImageView img41 = findViewById(R.id.img41);
        ImageView img42 = findViewById(R.id.img42);
        ImageView img43 = findViewById(R.id.img43);
        ImageView img44 = findViewById(R.id.img44);
        ImageView img45 = findViewById(R.id.img45);
        ImageView img46 = findViewById(R.id.img46);
        ImageView img47 = findViewById(R.id.img47);
        ImageView img48 = findViewById(R.id.img48);
        ImageView img49 = findViewById(R.id.img49);
        ImageView img50 = findViewById(R.id.img50);
        ImageView img51 = findViewById(R.id.img51);
        ImageView img52 = findViewById(R.id.img52);
        ImageView img53 = findViewById(R.id.img53);
        ImageView img54 = findViewById(R.id.img54);
        ImageView img55 = findViewById(R.id.img55);
        ImageView img56 = findViewById(R.id.img56);
        ImageView img57 = findViewById(R.id.img57);
        ImageView img58 = findViewById(R.id.img58);
        ImageView img59 = findViewById(R.id.img59);
        ImageView img60 = findViewById(R.id.img60);
        ImageView img61 = findViewById(R.id.img61);
        ImageView img62 = findViewById(R.id.img62);
        ImageView img63 = findViewById(R.id.img63);
        ImageView img64 = findViewById(R.id.img64);
        ImageView img65 = findViewById(R.id.img65);
        ImageView img66 = findViewById(R.id.img66);
        ImageView img67 = findViewById(R.id.img67);
        ImageView img68 = findViewById(R.id.img68);
        ImageView img69 = findViewById(R.id.img69);
        ImageView img70 = findViewById(R.id.img70);
        ImageView img71 = findViewById(R.id.img71);
        ImageView img72 = findViewById(R.id.img72);
        ImageView img73 = findViewById(R.id.img73);
        ImageView img74 = findViewById(R.id.img74);
        ImageView img75 = findViewById(R.id.img75);
        ImageView img76 = findViewById(R.id.img76);
        ImageView img77 = findViewById(R.id.img77);
        ImageView img78 = findViewById(R.id.img78);
        ImageView img79 = findViewById(R.id.img79);
        ImageView img80 = findViewById(R.id.img80);
        ImageView img81 = findViewById(R.id.img81);
        ImageView img82 = findViewById(R.id.img82);
        ImageView img83 = findViewById(R.id.img83);
        ImageView img84 = findViewById(R.id.img84);
        ImageView img85 = findViewById(R.id.img85);
        ImageView img86 = findViewById(R.id.img86);
        ImageView img87 = findViewById(R.id.img87);
        ImageView img88 = findViewById(R.id.img88);
        ImageView img89 = findViewById(R.id.img89);
        ImageView img90 = findViewById(R.id.img90);
        ImageView img91 = findViewById(R.id.img91);
        ImageView img92 = findViewById(R.id.img92);
        ImageView img93 = findViewById(R.id.img93);
        ImageView img94 = findViewById(R.id.img94);
        ImageView img95 = findViewById(R.id.img95);
        ImageView img96 = findViewById(R.id.img96);
        ImageView img97 = findViewById(R.id.img97);
        ImageView img98 = findViewById(R.id.img98);
        ImageView img99 = findViewById(R.id.img99);
        img0.setImageResource(R.drawable.unfilled);
        img1.setImageResource(R.drawable.unfilled);
        img2.setImageResource(R.drawable.unfilled);
        img3.setImageResource(R.drawable.unfilled);
        img4.setImageResource(R.drawable.unfilled);
        img5.setImageResource(R.drawable.unfilled);
        img6.setImageResource(R.drawable.unfilled);
        img7.setImageResource(R.drawable.unfilled);
        img8.setImageResource(R.drawable.unfilled);
        img9.setImageResource(R.drawable.unfilled);
        img10.setImageResource(R.drawable.unfilled);
        img11.setImageResource(R.drawable.unfilled);
        img12.setImageResource(R.drawable.unfilled);
        img13.setImageResource(R.drawable.unfilled);
        img14.setImageResource(R.drawable.unfilled);
        img15.setImageResource(R.drawable.unfilled);
        img16.setImageResource(R.drawable.unfilled);
        img17.setImageResource(R.drawable.unfilled);
        img18.setImageResource(R.drawable.unfilled);
        img19.setImageResource(R.drawable.unfilled);
        img20.setImageResource(R.drawable.unfilled);
        img21.setImageResource(R.drawable.unfilled);
        img22.setImageResource(R.drawable.unfilled);
        img23.setImageResource(R.drawable.unfilled);
        img24.setImageResource(R.drawable.unfilled);
        img25.setImageResource(R.drawable.unfilled);
        img26.setImageResource(R.drawable.unfilled);
        img27.setImageResource(R.drawable.unfilled);
        img28.setImageResource(R.drawable.unfilled);
        img29.setImageResource(R.drawable.unfilled);
        img30.setImageResource(R.drawable.unfilled);
        img31.setImageResource(R.drawable.unfilled);
        img32.setImageResource(R.drawable.unfilled);
        img33.setImageResource(R.drawable.unfilled);
        img34.setImageResource(R.drawable.unfilled);
        img35.setImageResource(R.drawable.unfilled);
        img36.setImageResource(R.drawable.unfilled);
        img37.setImageResource(R.drawable.unfilled);
        img38.setImageResource(R.drawable.unfilled);
        img39.setImageResource(R.drawable.unfilled);
        img40.setImageResource(R.drawable.unfilled);
        img41.setImageResource(R.drawable.unfilled);
        img42.setImageResource(R.drawable.unfilled);
        img43.setImageResource(R.drawable.unfilled);
        img44.setImageResource(R.drawable.unfilled);
        img45.setImageResource(R.drawable.unfilled);
        img46.setImageResource(R.drawable.unfilled);
        img47.setImageResource(R.drawable.unfilled);
        img48.setImageResource(R.drawable.unfilled);
        img49.setImageResource(R.drawable.unfilled);
        img50.setImageResource(R.drawable.unfilled);
        img51.setImageResource(R.drawable.unfilled);
        img52.setImageResource(R.drawable.unfilled);
        img53.setImageResource(R.drawable.unfilled);
        img54.setImageResource(R.drawable.unfilled);
        img55.setImageResource(R.drawable.unfilled);
        img56.setImageResource(R.drawable.unfilled);
        img57.setImageResource(R.drawable.unfilled);
        img58.setImageResource(R.drawable.unfilled);
        img59.setImageResource(R.drawable.unfilled);
        img60.setImageResource(R.drawable.unfilled);
        img61.setImageResource(R.drawable.unfilled);
        img62.setImageResource(R.drawable.unfilled);
        img63.setImageResource(R.drawable.unfilled);
        img64.setImageResource(R.drawable.unfilled);
        img65.setImageResource(R.drawable.unfilled);
        img66.setImageResource(R.drawable.unfilled);
        img67.setImageResource(R.drawable.unfilled);
        img68.setImageResource(R.drawable.unfilled);
        img69.setImageResource(R.drawable.unfilled);
        img70.setImageResource(R.drawable.unfilled);
        img71.setImageResource(R.drawable.unfilled);
        img72.setImageResource(R.drawable.unfilled);
        img73.setImageResource(R.drawable.unfilled);
        img74.setImageResource(R.drawable.unfilled);
        img75.setImageResource(R.drawable.unfilled);
        img76.setImageResource(R.drawable.unfilled);
        img77.setImageResource(R.drawable.unfilled);
        img78.setImageResource(R.drawable.unfilled);
        img79.setImageResource(R.drawable.unfilled);
        img80.setImageResource(R.drawable.unfilled);
        img81.setImageResource(R.drawable.unfilled);
        img82.setImageResource(R.drawable.unfilled);
        img83.setImageResource(R.drawable.unfilled);
        img84.setImageResource(R.drawable.unfilled);
        img85.setImageResource(R.drawable.unfilled);
        img86.setImageResource(R.drawable.unfilled);
        img87.setImageResource(R.drawable.unfilled);
        img88.setImageResource(R.drawable.unfilled);
        img89.setImageResource(R.drawable.unfilled);
        img90.setImageResource(R.drawable.unfilled);
        img91.setImageResource(R.drawable.unfilled);
        img92.setImageResource(R.drawable.unfilled);
        img93.setImageResource(R.drawable.unfilled);
        img94.setImageResource(R.drawable.unfilled);
        img95.setImageResource(R.drawable.unfilled);
        img96.setImageResource(R.drawable.unfilled);
        img97.setImageResource(R.drawable.unfilled);
        img98.setImageResource(R.drawable.unfilled);
        img99.setImageResource(R.drawable.unfilled);

        final ImageView images[] = {img0, img1, img2, img3, img4, img5, img6, img7, img8, img9, img10,
                img11, img12, img13, img14, img15, img16, img17, img18, img19, img20,
                img21, img22, img23, img24, img25, img26, img27, img28, img29, img30,
                img31, img32, img33, img34, img35, img36, img37, img38, img39, img40,
                img41, img42, img43, img44, img45, img46, img47, img48, img49, img50,
                img51, img52, img53, img54, img55, img56, img57, img58, img59, img60,
                img61, img62, img63, img64, img65, img66, img67, img68, img69, img70,
                img71, img72, img73, img74, img75, img76, img77, img78, img79, img80,
                img81, img82, img83, img84, img85, img86, img87, img88, img89, img90,
                img91, img92, img93, img94, img95, img96, img97, img98, img99};


        Random random = new Random();
        solution = random.nextInt(100);

        images[solution].setImageResource(R.drawable.gopherhole);

        populateArrays();

        //If it's not within 2 spaces of any border, just store all
        //adjacent neighbors in respective lists


        worker1.start();
        worker2.start();
        Looper l1 = worker1.getLooper();
        Looper l2 = worker2.getLooper();

        final Handler mainHandler = new Handler(getMainLooper());

        final Handler h1 = new Handler(l1) {
            @Override
            public void handleMessage(Message msg) {
                //super.handleMessage(msg);
                //Winner check
                if (msg.obj == "W1") {
                    mainHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            worker1.quit();
                            worker2.quit();
                            p1Text.setText("Player 1 wins!");
                        }
                    });
                }
                //Near miss check
                else if (msg.obj == "1NM") {
                    final int arg1 = msg.arg1;
                    mainHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            p1Text.setText("Near miss!");
                            images[arg1].setImageResource(R.drawable.p1guess);
                        }
                    });
                }
                //Close guess check
                else if (msg.obj == "1CG") {
                    final int arg1 = msg.arg1;
                    mainHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            p1Text.setText("Close guess!");
                            images[arg1].setImageResource(R.drawable.p1guess);
                        }
                    });
                }
                //Complete miss check
                else if (msg.obj == "1CM") {
                    final int arg1 = msg.arg1;
                    mainHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            p1Text.setText("Complete miss!");
                            images[arg1].setImageResource(R.drawable.p1guess);
                        }
                    });
                }
                //Disaster check
                else if (msg.obj == "1D") {
                    mainHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            p1Text.setText("Disaster! Already guessed");
                        }
                    });
                }
            }
        };
        final Handler h2 = new Handler(l2) {
            @Override
            public void handleMessage(Message msg) {
                //super.handleMessage(msg);
                //Winner check
                if (msg.obj == "W2") {
                    mainHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            worker1.quit();
                            worker2.quit();
                            p2Text.setText("Player 2 wins!");
                        }
                    });
                }
                //Near miss check
                else if (msg.obj == "2NM") {
                    final int arg1 = msg.arg1;
                    mainHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            p2Text.setText("Near miss!");
                            images[arg1].setImageResource(R.drawable.p2guess);
                        }
                    });
                }
                //Close guess check
                else if (msg.obj == "2CG") {
                    final int arg1 = msg.arg1;
                    mainHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            p2Text.setText("Close guess!");
                            images[arg1].setImageResource(R.drawable.p2guess);
                        }
                    });
                }
                //Complete miss check
                else if (msg.obj == "2CM") {
                    final int arg1 = msg.arg1;
                    mainHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            p2Text.setText("Complete miss!");
                            images[arg1].setImageResource(R.drawable.p2guess);
                        }
                    });
                }
                //Disaster check
                else if (msg.obj == "2D") {
                    mainHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            p2Text.setText("Disaster! Already guessed");
                        }
                    });
                }
            }
        };
        final Runnable t1Runnable = new Runnable() {
            @Override
            public void run() {
                Random rand = new Random();
                guess1 = rand.nextInt(100);
                //If the number has been guessed before
                if (guesses.contains(guess1)) {
                    Message msg = new Message();
                    msg.obj = "1D";
                    h1.sendMessage(msg);
                }
                else
                {
                    guesses.add(guess1);
                    if (guess1 == solution)
                    {
                        final Message msg = new Message();
                        msg.obj = "W1";
                        h1.sendMessage(msg);

                        mainHandler.post(new Runnable() {
                            @Override
                            public void run() {
                                worker1.quit();
                                worker2.quit();
                                if (msg.obj == "W1")
                                    p1Text.setText("Player 1 wins!");
                            }
                        });
                    }
                    //If we're in the middle of the grid
                    else if (oneAway.contains(guess2))
                    {
                        Message msg = new Message();
                        msg.obj = "1NM";
                        msg.arg1 = guess1;
                        h1.sendMessage(msg);
                    }
                    else if (Math.abs(guess1 - solution) < 23)
                    {
                        Message msg = new Message();
                        msg.obj = "2CG";
                        msg.arg2 = guess1;
                        h1.sendMessage(msg);
                    }
                    else
                    {
                        Message msg = new Message();
                        msg.obj = "1CM";
                        msg.arg2 = guess1;
                        h1.sendMessage(msg);

                        //When on the boundaries of the grid
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        final Runnable t2Runnable = new Runnable() {
            @Override
            public void run() {
                if (guesses.contains(guess2)) {
                    Message msg = new Message();
                    msg.obj = "2D";
                    h2.sendMessage(msg);
                }
                else
                {

                    guesses.add(guess2);

                    if (guess2 == solution) {
                        Message msg = new Message();
                        msg.obj = "W2";
                        h2.sendMessage(msg);
                    }
                    else if (oneAway.contains(guess2)) {
                        Message msg = new Message();
                        msg.obj = "2NM";
                        msg.arg1 = guess2;
                        h2.sendMessage(msg);
                    }
                    else if (twoAway.contains(guess2)) {
                        Message msg = new Message();
                        msg.obj = "2CG";
                        msg.arg2 = guess2;
                        h2.sendMessage(msg);
                    }
                    else {
                        Message msg = new Message();
                        msg.obj = "2CM";
                        msg.arg2 = guess1;
                        h2.sendMessage(msg);
                    }
                    guess2++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };

        Button startButton = findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //First thread runs a linear search
                h1.post(t1Runnable);
            }
        });
    }

    public void populateArrays() {
        if (solution >= 22 && solution <= 77) {
            oneAway.add(solution + 1);
            oneAway.add(solution - 1);
            oneAway.add(solution + 10);
            oneAway.add(solution - 10);
            oneAway.add(solution + 11);
            oneAway.add(solution - 11);
            oneAway.add(solution + 9);
            oneAway.add(solution - 9);

            twoAway.add(solution + 22);
            twoAway.add(solution - 22);
            twoAway.add(solution + 2);
            twoAway.add(solution - 2);
            twoAway.add(solution + 18);
            twoAway.add(solution - 18);
            twoAway.add(solution - 21);
            twoAway.add(solution - 19);
            twoAway.add(solution + 19);
            twoAway.add(solution + 21);
            twoAway.add(solution + 20);
            twoAway.add(solution - 20);
            twoAway.add(solution + 8);
            twoAway.add(solution - 8);
            twoAway.add(solution + 12);
            twoAway.add(solution - 12);
        }
        if (solution == 9) {
            oneAway.add(8);
            oneAway.add(18);
            oneAway.add(9);

            twoAway.add(7);
            twoAway.add(17);
            twoAway.add(27);
            twoAway.add(28);
            twoAway.add(29);
        }
        if (solution == 90) {
            oneAway.add(80);
            oneAway.add(81);
            oneAway.add(91);

            twoAway.add(70);
            twoAway.add(71);
            twoAway.add(72);
            twoAway.add(82);
            twoAway.add(92);
        }
        if (solution == 99) {
            oneAway.add(89);
            oneAway.add(88);
            oneAway.add(98);

            twoAway.add(79);
            twoAway.add(78);
            twoAway.add(77);
            twoAway.add(87);
            twoAway.add(97);
        }
        if (solution == 0) {
            oneAway.add(1);
            oneAway.add(11);
            oneAway.add(10);

            twoAway.add(20);
            twoAway.add(21);
            twoAway.add(22);
            twoAway.add(17);
            twoAway.add(2);
        }

        if (solution == 10) {
            oneAway.add(solution - 10);
            oneAway.add(solution - 9);
            oneAway.add(solution + 1);
            oneAway.add(solution + 11);
            oneAway.add(solution + 10);

            twoAway.add(solution + 20);
            twoAway.add(solution + 21);
            twoAway.add(solution + 22);
            twoAway.add(solution + 12);
            twoAway.add(solution - 8);
            twoAway.add(solution + 2);
        }
        if (solution == 80) {
            oneAway.add(70);
            oneAway.add(71);
            oneAway.add(81);
            oneAway.add(91);
            oneAway.add(90);

            twoAway.add(60);
            twoAway.add(61);
            twoAway.add(62);
            twoAway.add(72);
            twoAway.add(82);
            twoAway.add(92);
        }
        if (solution == 89) {
            oneAway.add(78);
            oneAway.add(79);
            oneAway.add(88);
            oneAway.add(98);
            oneAway.add(99);

            twoAway.add(67);
            twoAway.add(68);
            twoAway.add(69);
            twoAway.add(77);
            twoAway.add(87);
            twoAway.add(97);
        }
        if (solution == 19) {
            oneAway.add(8);
            oneAway.add(9);
            oneAway.add(18);
            oneAway.add(28);
            oneAway.add(29);

            twoAway.add(7);
            twoAway.add(17);
            twoAway.add(27);
            twoAway.add(37);
            twoAway.add(38);
            twoAway.add(39);
        }
        if (solution == 1 || solution == 8) {
            oneAway.add(solution + 1);
            oneAway.add(solution - 1);
            oneAway.add(solution + 9);
            oneAway.add(solution + 10);
            oneAway.add(solution + 11);

            twoAway.add(solution + 19);
            twoAway.add(solution + 20);
            twoAway.add(solution + 21);
            twoAway.add(solution + 2);
            twoAway.add(solution + 12);
            twoAway.add(solution + 22);
        }
        if (solution == 91 || solution == 98) {
            oneAway.add(solution + 1);
            oneAway.add(solution - 1);
            oneAway.add(solution - 9);
            oneAway.add(solution - 10);
            oneAway.add(solution - 11);

            twoAway.add(solution - 19);
            twoAway.add(solution - 20);
            twoAway.add(solution - 21);
            twoAway.add(solution - 2);
            twoAway.add(solution - 12);
            twoAway.add(solution - 22);
        }
        if (solution == 20 || solution == 30 || solution == 40 || solution == 50 || solution == 60 || solution == 70) {
            oneAway.add(solution + 1);
            oneAway.add(solution - 10);
            oneAway.add(solution + 10);
            oneAway.add(solution - 9);
            oneAway.add(solution + 11);

            twoAway.add(solution - 20);
            twoAway.add(solution - 19);
            twoAway.add(solution - 18);
            twoAway.add(solution - 8);
            twoAway.add(solution + 2);
            twoAway.add(solution + 12);
            twoAway.add(solution + 22);
            twoAway.add(solution + 20);
            twoAway.add(solution + 21);
        }
        if (solution == 29 || solution == 39 || solution == 49 || solution == 59 || solution == 69 || solution == 79) {
            oneAway.add(solution - 1);
            oneAway.add(solution + 10);
            oneAway.add(solution - 10);
            oneAway.add(solution + 9);
            oneAway.add(solution - 11);

            twoAway.add(solution + 20);
            twoAway.add(solution + 19);
            twoAway.add(solution + 18);
            twoAway.add(solution + 8);
            twoAway.add(solution - 2);
            twoAway.add(solution - 12);
            twoAway.add(solution - 22);
            twoAway.add(solution - 20);
            twoAway.add(solution - 21);
        }
        if (solution == 11 || solution == 18) {
            oneAway.add(solution - 9);
            oneAway.add(solution - 10);
            oneAway.add(solution - 11);
            oneAway.add(solution - 1);
            oneAway.add(solution + 1);
            oneAway.add(solution + 9);
            oneAway.add(solution + 10);
            oneAway.add(solution + 11);

            twoAway.add(solution + 19);
            twoAway.add(solution + 20);
            twoAway.add(solution + 21);
            twoAway.add(solution + 22);
            twoAway.add(solution + 12);
            twoAway.add(solution + 2);
            twoAway.add(solution - 8);
        }
        if (solution == 81 || solution == 88) {
            oneAway.add(solution + 9);
            oneAway.add(solution + 10);
            oneAway.add(solution + 11);
            oneAway.add(solution + 1);
            oneAway.add(solution - 1);
            oneAway.add(solution - 9);
            oneAway.add(solution - 10);
            oneAway.add(solution - 11);

            twoAway.add(solution - 19);
            twoAway.add(solution - 20);
            twoAway.add(solution - 21);
            twoAway.add(solution - 22);
            twoAway.add(solution - 12);
            twoAway.add(solution - 2);
            twoAway.add(solution + 8);
        }
        if (solution == 21 || solution == 31 || solution == 41 || solution == 51 || solution == 61 || solution == 71) {
            oneAway.add(solution + 9);
            oneAway.add(solution + 10);
            oneAway.add(solution + 11);
            oneAway.add(solution + 1);
            oneAway.add(solution - 1);
            oneAway.add(solution - 9);
            oneAway.add(solution - 10);
            oneAway.add(solution - 11);

            twoAway.add(solution - 21);
            twoAway.add(solution - 20);
            twoAway.add(solution - 19);
            twoAway.add(solution - 18);
            twoAway.add(solution - 20);
            twoAway.add(solution + 2);
            twoAway.add(solution + 12);
            twoAway.add(solution + 22);
            twoAway.add(solution + 21);
            twoAway.add(solution + 20);
            twoAway.add(solution + 21);
        }
        if (solution == 28 || solution == 38 || solution == 48 || solution == 58 || solution == 68 || solution == 78) {
            oneAway.add(solution - 9);
            oneAway.add(solution - 10);
            oneAway.add(solution - 11);
            oneAway.add(solution - 1);
            oneAway.add(solution + 1);
            oneAway.add(solution + 9);
            oneAway.add(solution + 10);
            oneAway.add(solution + 11);

            twoAway.add(solution + 21);
            twoAway.add(solution + 20);
            twoAway.add(solution + 19);
            twoAway.add(solution + 18);
            twoAway.add(solution + 20);
            twoAway.add(solution - 2);
            twoAway.add(solution - 12);
            twoAway.add(solution - 22);
            twoAway.add(solution - 21);
            twoAway.add(solution - 20);
            twoAway.add(solution - 21);
        }
        if (solution >= 82 && solution <= 87) {
            oneAway.add(solution - 9);
            oneAway.add(solution - 10);
            oneAway.add(solution - 11);
            oneAway.add(solution - 1);
            oneAway.add(solution + 1);
            oneAway.add(solution + 9);
            oneAway.add(solution + 10);
            oneAway.add(solution + 11);

            twoAway.add(solution + 8);
            twoAway.add(solution + 2);
            twoAway.add(solution + 12);
            twoAway.add(solution - 2);
            twoAway.add(solution - 12);
            twoAway.add(solution - 22);
            twoAway.add(solution - 21);
            twoAway.add(solution - 20);
            twoAway.add(solution - 19);
            twoAway.add(solution - 18);
            twoAway.add(solution - 8);
        }
        if (solution >= 12 && solution <= 17) {
            oneAway.add(solution - 9);
            oneAway.add(solution - 10);
            oneAway.add(solution - 11);
            oneAway.add(solution - 1);
            oneAway.add(solution + 1);
            oneAway.add(solution + 9);
            oneAway.add(solution + 10);
            oneAway.add(solution + 11);

            twoAway.add(solution - 8);
            twoAway.add(solution - 2);
            twoAway.add(solution - 12);
            twoAway.add(solution + 2);
            twoAway.add(solution + 12);
            twoAway.add(solution + 22);
            twoAway.add(solution + 21);
            twoAway.add(solution + 20);
            twoAway.add(solution + 19);
            twoAway.add(solution + 18);
            twoAway.add(solution + 8);
        }
        if (solution >= 2 && solution <= 17)
        {
            oneAway.add(solution - 1);
            oneAway.add(solution + 1);
            oneAway.add(solution + 9);
            oneAway.add(solution + 10);
            oneAway.add(solution + 11);

            twoAway.add(solution - 2);
            twoAway.add(solution + 2);
            twoAway.add(solution + 12);
            twoAway.add(solution + 22);
            twoAway.add(solution + 21);
            twoAway.add(solution + 20);
            twoAway.add(solution + 19);
            twoAway.add(solution + 18);
            twoAway.add(solution + 8);
        }
        if (solution >= 92 && solution <= 97)
        {
            oneAway.add(solution + 1);
            oneAway.add(solution - 1);
            oneAway.add(solution - 9);
            oneAway.add(solution - 10);
            oneAway.add(solution - 11);

            twoAway.add(solution + 2);
            twoAway.add(solution - 2);
            twoAway.add(solution - 12);
            twoAway.add(solution - 22);
            twoAway.add(solution - 21);
            twoAway.add(solution - 20);
            twoAway.add(solution - 19);
            twoAway.add(solution - 18);
            twoAway.add(solution - 8);
        }
    }
}