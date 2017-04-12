package com.battmenstudios.schmelda.constants;

import com.battmenstudios.schmelda.models.Obstacle;

import java.util.ArrayList;

/**
 * Created by benvi on 4/10/2017.
 */

public class Level {


    // private static String levelBlank =
    //
    // "  ........................................\n"
    // + "........................................\n"
    // + "........................................\n"
    // + "........................................\n"
    // + "........................................\n"
    // + "........................................\n"
    // + "........................................\n"
    // + "........................................\n"
    // + "........................................\n"
    // + "........................................\n"
    // + "........................................\n"
    // + "........................................\n"
    // + "........................................\n"
    // + "........................................\n"
    // + "........................................\n"
    // + "........................................\n"
    // + "........................................\n"
    // + "........................................\n"
    // + "........................................\n"
    // + "........................................\n"
    // + "........................................\n";

    private static String level1 =

                      "##################################################\n"
                    + "##################################################\n"
                    + "#sggggggggggggggggggggggggggggggggggggggggggggggr#\n"
                    + "#l..............................................c#\n"
                    + "#l............................$$$$$$$$$...tt....c#\n"
                    + "#l............................$$$$$$$$$...tt....c#\n"
                    + "#l.......wwwwwwwww............$$$$f$$$$.........c#\n"
                    + "#l.......wwwwwwwww............$$$$$$$$$.........c#\n"
                    + "#l.......wwwwwwwww............$$$$$$$$$.........c#\n"
                    + "#l.......wwwwwwwww...............$$.............c#\n"
                    + "#l...............................$$.............c#\n"
                    + "#l...............................$$.............c#\n"
                    + "gv...............................$$.............c#\n"
                    + "2$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.............c#\n"
                    + "2$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.............c#\n"
                    + "hp..............................................c#\n"
                    + "#l..............................................c#\n"
                    + "#l...........e..........t.t.t.t.t.t.t.t.........c#\n"
                    + "#l!.....................t.t.t.t.t.t.t.t.........c#\n"
                    + "#l......................t.t.t.t.t.t.t.t.........c#\n"
                    + "#l......................t.t.t.t.t.t.t.t.........c#\n"
                    + "#l......................t.t.t.t.i.t.t.t.........c#\n"
                    + "#l......................t.t.t.t.t.t.t.t.........c#\n"
                    + "#l......................t.t.t.t.t.t.t.t.........c#\n"
                    + "#l..............................................c#\n"
                    + "#l..............................................c#\n"
                    + "#l..............................................c#\n"
                    + "#bhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhha#\n"
                    + "##################################################\n";


    private static String level2 =
            "##################################################\n"
                    + "##################################################\n"
                    + "##sggggggggggggggggggggggggggggggggggggggggggggggr\n"
                    + "##l..............................................c\n"
                    + "##l..$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.........c\n"
                    + "#sv..$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.........c\n"
                    + "#l...$$..wwwwwwwww......N.........n...$$.........c\n"
                    + "#l...$$..wwwwwwwww....................$$.........c\n"
                    + "#l...$$..wwwwwwwww....................$$.........c\n"
                    + "#l...$$..wwwwwwwww................o...$$.........c\n"
                    + "#l...$$..wwwwwwwww....................$$.........c\n"
                    + "#l...$$........ttttttttt..............$$.........c\n"
                    + "#l...$$........ttttttttt..............$$.........c\n"
                    + "sv...$$..............tttttt...........$$.........c\n"
                    + "l....$$m...............tttttttt.......$$$$$$$$$$$1\n"
                    + "l....$$...........tttttt..ttttttt.....$$$$$$$$$$$1\n"
                    + "bp...$$.............tttttttttt.ttttttttttttttttuhh\n"
                    + "#lt..$$.....................tttttttttttttttttttc##\n"
                    + "#ltt.$$.........ttttttttt.tttttttttttttttttttttc##\n"
                    + "#ltt.$$...........tttt..tttttttttttttttttttttttc##\n"
                    + "#ltt.$$$$$$$$$$$$$..tttttttttttttttttttttttttttc##\n"
                    + "#lttt$$$$$$$$$$$$$.........ttttttttttttttttttttc##\n"
                    + "svttt.t.........$$..........tttttttttttttttttttc##\n"
                    + "lttttt.t.t......$$...M.......e........t.t.tttttc##\n"
                    + "bptttttt.t.t....$$$$$$$..............t.t.ttttttc##\n"
                    + "#lttttttttttt.t.$$$$$$$...........t.tttttttttttc##\n"
                    + "#lttttttttttt.t.t....$$.........t.t.tttttttttttc##\n"
                    + "#lttttttttttt........$$.............tttttttttttc##\n"
                    + "#bhhhhptttttt.......................ttttttuhhhha##\n"
                    + "######ltttttt3t3t333333333333333t3t3ttttttc#######\n";

    private static String level3 =
            "######ltttttt2t2t222222222222222t2t2ttttttc#######\n"
                    + "##sgggvtttttt.......................ttttttc#######\n"
                    + "##ltttttttttt.......................ttttttygggggr#\n"
                    + "##ltttt.........................................c#\n"
                    + "##ltt...........................................yg\n"
                    + "##lt.......m.....................................t\n"
                    + "##l......uhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhp.......t\n"
                    + "sgv......c###############################bpttt...t\n"
                    + "l........c################################ltttt..t\n"
                    + "l........c################################lttttttt\n"
                    + "l........c################################lttttttt\n"
                    + "l........c################################lttttttt\n"
                    + "l........yggggggggrsggggggggggggggggggggggv.tttttt\n"
                    + "l.................cl...........................ttt\n"
                    + "l.................cl.....uhhp....................t\n"
                    + "l.................cl.....yggv....................4\n"
                    + "l.....n...........cl.......m.......tttt..........4\n"
                    + "bhp...............cl...............wwwwwwwwwwwwwww\n"
                    + "##l...............yv....m..........twwwwwwwwwwwwww\n"
                    + "##lt..............E................twwwwwwwwwwwwww\n"
                    + "##lt...........ttttt...............twwwwwwwwwwwwww\n"
                    + "##lt...............................twwwwwwwwwwwwww\n"
                    + "##ltt..............................twwwwwwwwwwwwww\n"
                    + "##ltt.t.............O...........wwwwwwwwwwwwwwwwww\n"
                    + "##lttt.t.t......................wwwwwwwwwwwwwwwwww\n"
                    + "##lttttt.t.t...................twwwwwwwwwwwwwwwwww\n"
                    + "##ltttttttttt.t...............ttwwwwwwwwwwwwwwwwww\n"
                    + "##ltttttttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
                    + "##bhhhhpttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
                    + "#######lttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n";

    private static String level4 =
            "##################################################\n"
                    + "#sgggggggggggggggggggggggggggggggggggggggggggggggr\n"
                    + "#l...............................................y\n"
                    + "#l........q....................up................t\n"
                    + "gv................up...........cl................t\n"
                    + "t..............N..cl...........yv................t\n"
                    + "t....uhhhhhp......yv....................tttttttttt\n"
                    + "t....c#####l............................t........8\n"
                    + "t....c#####l......uhhhhhhhhhp...........t........8\n"
                    + "t....ygggggv......c#########l......n....t........8\n"
                    + "t.................c#########l...........t........8\n"
                    + "t.................ygggggggggv....................8\n"
                    + "t.......M.............................Q..........8\n"
                    + "t.......up....................up........t........8\n"
                    + "t.......cl....................cl........t........8\n"
                    + "3.......yv..........M.........yv........t........8\n"
                    + "3...........tttttttttttttt.........tttttt........8\n"
                    + "wwwwwwwwwwwwwwww...................tt............8\n"
                    + "wwwwwwwwwwwwwwww............up...................8\n"
                    + "wwwwwwwwwwwwwwww............cl.....tt............8\n"
                    + "wwwwwwwwwwwwwwww............cl.....tt............8\n"
                    + "wwwwwwwwwwwwwwww............cl.....tt............8\n"
                    + "wwwwwwwwwwwwwwww............cl...................8\n"
                    + "wwwwwwwwwwwwwwwwww..........cl...................8\n"
                    + "wwwwwwwwwwwwwwwwww..........cl.........Q.........8\n"
                    + "wwwwwwwwwwwwwwwwww..........cl...................8\n"
                    + "wwwwwwwwwwwwwwwwww..........cl...............ttttt\n"
                    + "wwwwwwwwwwwwwwwwww..........yv...............ttttt\n"
                    + "wwwwwwwwwwwwwwwwww...........................ttttt\n"
                    + "wwwwwwwwwwwwwwwwww555555555555555555555555555ttttt\n";

    private static String level5 =
            "wwwwwwwwwwwwwwwwww444444444444444444444444444ttttt\n"
                    + "wwwwwwwwwwwwwwwwww...........................ttttt\n"
                    + "wwwwwwwwwwwwwwwwww..................t........ttttu\n"
                    + "wwwwwwwwwwwwwwwwww...........t...............ttttc\n"
                    + "wwwwwwwwwwwwwwwwww...t.....................t.....y\n"
                    + "wwwwwwwwwwwwwwwwwwwwwwwww$$wwwwwwwwwwwwwwwwwwwwwww\n"
                    + "wwwwwwwwwwwwwwwwww...............................t\n"
                    + "t.....................................t..........t\n"
                    + "t....t..................t........................t\n"
                    + "t..........n.......t.......m..........t..........t\n"
                    + "t.................................M..............t\n"
                    + "t.......t........................................t\n"
                    + "t..............t..........t.................t....t\n"
                    + "t................N....t..........t...............t\n"
                    + "t.......t.............................t..........t\n"
                    + "t.............t.........t........................7\n"
                    + "t.............................N...........Q......7\n"
                    + "hhhhhhhhhhhhhhhhhp..................t............7\n"
                    + "########$$$$$####l........t................t.....7\n"
                    + "##$$$###$###$####l................t..............7\n"
                    + "##$#$###$$$#$$$##l......t........................7\n"
                    + "##$#$#####$###$##l..........q..........t.........7\n"
                    + "##$#$$$$$$$###$##l........t......................7\n"
                    + "##$###########$##l...............................7\n"
                    + "##$$$$$$$#####$##l..................t............7\n"
                    + "########$$####$##l....t.............O.......uhhhhh\n"
                    + "6$$######$$###$##l........................uha#####\n"
                    + "##$$$$$$$$$###$##l............t.........uha#######\n"
                    + "##############$$$$...M.................ua#########\n"
                    + "##################hhhhhhhhhhhhhhhhhhhhha##########\n";

    private static String level6 =
            "######svttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
                    + "######ltttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
                    + "######ltttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
                    + "######ltttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
                    + "######ltttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
                    + "######ltttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
                    + "######ltttttttttttttttttttttttttwwwwwwwwwwwwwwwwww\n"
                    + "######l..........................................t\n"
                    + "######l.............M..........up................t\n"
                    + "######l........................cl.........E......t\n"
                    + "######l........N.........N.....cl................t\n"
                    + "######l........................yv................t\n"
                    + "######l.............M............................t\n"
                    + "######l........................uhhhhhhhhhhhhhhhptt\n"
                    + "######l..........E......e......ygggggggggggggggvtt\n"
                    + "######l..............E.....E.....................t\n"
                    + "######l......e....ttt.....................Q......t\n"
                    + "######l.........M...........N......t.............u\n"
                    + "######l......t.....................t......M......c\n"
                    + "######l.................N.......N..t.............c\n"
                    + "######l...........ttt..............t......m......c\n"
                    + "######l.....................t.....ttttttttt......c\n"
                    + "######l.........M.................t..............c\n"
                    + "######l...........................t...E...Q......c\n"
                    + "######l..........k.....ttt........t.N...uhhhhhhhha\n"
                    + "######l...........................t.....yggggggggg\n"
                    + "######l..........t................t.....E........5\n"
                    + "######l...........................t.....uhhhhhhhhh\n"
                    + "######l...........................t....ua#########\n"
                    + "######bhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhha##########\n";

    private static String level7 =
            "tttt8888w888888888888888888888888888888ygggggggggr\n"
                    + "tttt....w.....Q....Q.......Q....Q...Q............c\n"
                    + "ttt.....w........q....q........q.....q....q......c\n"
                    + "tt..H...w........................m............N..c\n"
                    + "t.......w........................................c\n"
                    + "wwwwwwwww..............ttttttttt.................c\n"
                    + "tt...............................................c\n"
                    + "tttt.............................................c\n"
                    + "ttttt........m......................t............c\n"
                    + "tttttt.............n.............................c\n"
                    + "ttttttt...n...t................t.................c\n"
                    + "ttttttt.................................M........c\n"
                    + "tttttt........M..................................c\n"
                    + "ttttt................N.ttttttttt.................c\n"
                    + "tttt.............................................c\n"
                    + "5..............o............m...............t....c\n"
                    + "5................................................c\n"
                    + "5....N...........................................c\n"
                    + "5...................t............................c\n"
                    + "5........t..........................uhhhp........c\n"
                    + "5.....................m..........n..c###l........c\n"
                    + "5...................................ygggv........c\n"
                    + "5.....................................M..........c\n"
                    + "5.........m...............wwwwww.................c\n"
                    + "5......................N..wwwwww.................c\n"
                    + "hhhhhhp........t..........wwwwww...............t.c\n"
                    + "######l..........................................c\n"
                    + "######l............t....................uhhhhhhhha\n"
                    + "######l................................ua#########\n"
                    + "######bhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhha##########\n";


    private static String level8 =
            "  @                                               \n"
                    + "###                                           ####\n"
                    + "#ww                                           ww##\n"
                    + "#ww                                           ww##\n"
                    + "#ww                                           ww##\n"
                    + "#ww                                           ww##\n"
                    + "#ww                                           ww##\n"
                    + "tww..................++++++++.................ww##\n"
                    + "tww..................++++++++.................ww##\n"
                    + "twwwwwwwwwwwwwwwwwwwwzzzzzzzzwwwwwwwwwwwwwwwwwwww#\n"
                    + "twwwwwwwwwwwwwwwwwww^++++++++^wwwwwwwwwwwwwwwwwww#\n"
                    + "4.......w...........%++++++++%...................t\n"
                    + "4.......w..E.........++++++++.........E..........t\n"
                    + "4.......w............++++++++....................t\n"
                    + "4.......w......e...n.++++++++....e...............t\n"
                    + "4.......w..........m.++++++++....................t\n"
                    + "4.......w.......ftttt++++++++ttttf.......e.......t\n"
                    + "4.......w..e.....++++++++++++++++M...............#\n"
                    + "4.......w.......f++++++++++++++++f..........E....#\n"
                    + "4.......w......M.++++++++++++++++................#\n"
                    + "4.......w.......f++++++++++++++++f.....E.........#\n"
                    + "4.......w........++++++++++++++++................#\n"
                    + "4.......w.......f++++++++++++++++f.........e.....#\n"
                    + "4.......w.E.......ttt++++++++ttt.......e.........#\n"
                    + "4.......w................m.......................#\n"
                    + "4.......w..e..........E.....................######\n"
                    + "tttt....w.........................E..............#\n"
                    + "tttt....w......E........................##########\n"
                    + "tttt....w..............................###########\n"
                    + "tttt7777w777777777777777777777777777777###########\n";


    private static String level9 =
            "                        000                       \n"
                    + "                        +e+                       \n"
                    + "                        +++                       \n"
                    + "                        +++                       \n"
                    + "         ++++++++++++++++++                       \n"
                    + "         +                                        \n"
                    + "         +                                        \n"
                    + "         +       +++++++++++++++++++              \n"
                    + "         +       +                 +              \n"
                    + "         +       +       +++++++++++              \n"
                    + "         +       +     +++                        \n"
                    + "         +++++++++     +                          \n"
                    + "                       +                          \n"
                    + "                      ++++++++++++                \n"
                    + "                                 +                \n"
                    + "                              ++++                \n"
                    + "                              +  +                \n"
                    + "                              +  +                \n"
                    + "      ++++++++++++++++++++++++++++                \n"
                    + "      +   +                                       \n"
                    + "      ++++++++++++++++++                          \n"
                    + "                       +                          \n"
                    + "                     +++                          \n"
                    + "                     +                            \n"
                    + "                     +++++++++                    \n"
                    + "                             +                    \n"
                    + "                             +                    \n"
                    + "                             +                    \n"
                    + "                             +                    \n"
                    + "                             +                    \n";

    private static String level0 =
            "                                                  \n"
                    + "                                                  \n"
                    + "                                                  \n"
                    + "                                                  \n"
                    + "                                                  \n"
                    + "                                                  \n"
                    + "                                                  \n"
                    + "                                                  \n"
                    + "                  +++++++++++++++                 \n"
                    + "                  +++++++++++++++                 \n"
                    + "                  ++++ddddddd++++                 \n"
                    + "                  ++++ddddddd++++                 \n"
                    + "                  ++++dddBddd++++                 \n"
                    + "                  ++++ddddddd++++                 \n"
                    + "                  ++++ddddddd++++                 \n"
                    + "                  +++++++++++++++                 \n"
                    + "                  +++++++++++++++                 \n"
                    + "                  +++++++++++++++                 \n"
                    + "                  +++++++++++++++                 \n"
                    + "                  +++++++++++++++                 \n"
                    + "                        +++                       \n"
                    + "                        +++                       \n"
                    + "                        +++                       \n"
                    + "                        +H+                       \n"
                    + "                        +++                       \n"
                    + "                        +++                       \n"
                    + "                        +++                       \n"
                    + "                        +++                       \n"
                    + "                        +++                       \n"
                    + "                        000                       \n";



    public static String getLevel(int _level) {
        switch(_level) {
            case 1: return level1;
            case 2: return level2;
            case 3: return level3;
            case 4: return level4;
            case 5: return level5;
            case 6: return level6;
            case 7: return level7;
            case 8: return level8;
            case 9: return level9;
            case 0: return level0;

        }
        return "chain is awesome";
    }

    public static ArrayList<Obstacle> generateLevel(int level) {
        ArrayList<Obstacle> models = new ArrayList<Obstacle>();
        Obstacle model;
        int y = 0;
        int x = 0;
        int SPACE = 16;
        String newLevel = "";
        switch(level) {
            case 1: newLevel = level1; break;
            case 2: newLevel = level2; break;
            case 3: newLevel = level3; break;
            case 4: newLevel = level4; break;
            case 5: newLevel = level5; break;
            case 6: newLevel = level6; break;
            case 7: newLevel = level7; break;
            case 8: newLevel = level8; break;
            case 9: newLevel = level9; break;
            case 0: newLevel = level0; break;
        }
        for (int i = 0; i < newLevel.length(); i++) {
            char item = newLevel.charAt(i);
            if (item == '\n') {
                y += SPACE;
                x = 0;
            } else if (item == '#') {
                model = new Obstacle(x, y, '#');
                models.add(model);
                x += SPACE;
            } else if (item == 'v') {
                model = new Obstacle(x, y, 'v');
               models.add(model);
                x += SPACE;
            } else if (item == 'g') {
                model = new Obstacle(x,y, 'g');
                models.add(model);
                x += SPACE;
            }else if (item == 'l') {
                model = new Obstacle(x,y, 'l');
                models.add(model);
                x += SPACE;
            }else if (item == 'c') {
                model = new Obstacle(x,y, 'c');
                models.add(model);
                x += SPACE;
            }else if (item == 'h') {
                model = new Obstacle(x,y, 'h');
                models.add(model);
                x += SPACE;
            }else if (item == 'r') {
                model = new Obstacle(x,y, 'r');
                models.add(model);
                x += SPACE;
            }else if (item == 's') {
                model = new Obstacle(x,y, 's');
                models.add(model);
                x += SPACE;
            }else if (item == 'a') {
                model = new Obstacle(x,y, 'a');
                models.add(model);
                x += SPACE;
            }else if (item == 'b') {
                model = new Obstacle(x,y, 'b');
                models.add(model);
                x += SPACE;
            }else if (item == 'u') {
                model = new Obstacle(x,y, 'u');
                models.add(model);
                x += SPACE;
            }else if (item == 'p') {
                model = new Obstacle(x,y, 'p');
                models.add(model);
                x += SPACE;
            }else if (item == 'y') {
                model = new Obstacle(x,y, 'y');
                models.add(model);
                x += SPACE;
            }else if (item == 'w') {
                model = new Obstacle(x, y, 'w');
                models.add(model);
                x += SPACE;
            } else if (item == 't') {
//                model = new Obstacle(x, y, '.');
//                areas.add(a);
//                collidables.add(t);
//                models.add(model);
                model = new Obstacle(x, y, 't');
                models.add(model);
                x += SPACE;
            }
            else {
                x += SPACE;
            }
// else if (item == '.') {
//                a = new Area(x, y);
//                areas.add(a);
//                x += SPACE;
//            } else if (item == 'B') {
//                dangerTile = new CobbleStone(x, y);
//                dangerTiles.add(dangerTile);
//                cobbleStone = new CobbleStone(x, y);
//                areas.add(cobbleStone);
//                boss = new Boss(x, y);
//                boss.fireBlastCounter(boss);
//                bosses.add(boss);
//                x += SPACE;
//            } else if (item == 'e') {
//                enemyCounter = enemies.size();
//                e = new Enemy(x, y, 1, enemyCounter, 'e');
//                a = new Area(x, y);
//                areas.add(a);
//                enemies.add(e);
//                if(levelCount == 9){
//                    e.slimeSpawn(enemies);
//                }
//                x += SPACE;
//            } else if (item == 'E') {
//                enemyCounter = enemies.size();
//                hard = new Enemy(x, y, 2, enemyCounter, 'E');
//                a = new Area(x, y);
//                areas.add(a);
//                enemies.add(hard);
//                x += SPACE;
//            } else if (item == 'q') {
//                enemyCounter = enemies.size();
//                e = new Enemy(x, y, 1, enemyCounter, 'q');
//                a = new Area(x, y);
//                areas.add(a);
//                enemies.add(e);
//                x += SPACE;
//            }else if (item == 'Q') {
//                enemyCounter = enemies.size();
//                hard = new Enemy(x, y, 2, enemyCounter, 'Q');
//                a = new Area(x, y);
//                areas.add(a);
//                enemies.add(hard);
//                x += SPACE;
//            }else if (item == 'o') {
//                enemyCounter = enemies.size();
//                e = new Enemy(x, y, 1, enemyCounter, 'o');
//                a = new Area(x, y);
//                areas.add(a);
//                enemies.add(e);
//                x += SPACE;
//            }else if (item == 'O') {
//                enemyCounter = enemies.size();
//                hard = new Enemy(x, y, 2, enemyCounter, 'O');
//                a = new Area(x, y);
//                areas.add(a);
//                enemies.add(hard);
//                x += SPACE;
//            }else if (item == 'n') {
//                enemyCounter = enemies.size();
//                e = new Enemy(x, y, 1, enemyCounter, 'n');
//                a = new Area(x, y);
//                areas.add(a);
//                enemies.add(e);
//                x += SPACE;
//            }else if (item == 'N') {
//                enemyCounter = enemies.size();
//                hard = new Enemy(x, y, 2, enemyCounter, 'N');
//                a = new Area(x, y);
//                areas.add(a);
//                enemies.add(hard);
//                x += SPACE;
//            }else if (item == 'm') {
//                enemyCounter = enemies.size();
//                e = new Enemy(x, y, 1, enemyCounter, 'm');
//                a = new Area(x, y);
//                areas.add(a);
//                enemies.add(e);
//                x += SPACE;
//            }else if (item == 'M') {
//                enemyCounter = enemies.size();
//                hard = new Enemy(x, y, 2, enemyCounter, 'M');
//                a = new Area(x, y);
//                areas.add(a);
//                enemies.add(hard);
//                x += SPACE;
//            }else if (item == 'k') {
//                a = new Area(x, y);
//                areas.add(a);
//                if(!hud.keyIcon.isVisible())
//                {
//                    key = new Item(x, y);
//                    items.add(key);
//                }
//                x += SPACE;
//            } else if (item == ' ') {
//                space = new Space(x, y);
//                collidables.add(space);
//                x += SPACE;
//            } else if (item == 'f') {
//                f = new Fire(x, y);
//                p = new Path(x, y);
//                areas.add(p);
//                collidables.add(f);
//                x += SPACE;
//            }  else if (item == '$') {
//                p = new Path(x, y);
//                areas.add(p);
//                x += SPACE;
//            } else if (item == '1' || item == '2' || item == '3' || item == '4'|| item == '5'|| item == '6'|| item == '7'|| item == '8'|| item == '9'|| item == '0') {
//                p = new Path(x, y);
//                areas.add(p);
//                warp = new Warp(x, y, item);
//                warps.add(warp);
//                x += SPACE;
//            } else if (item == 'i') {
//                a = new Area(x, y);
//                areas.add(a);
//                warp = new Warp(x, y, 'i');
//                warps.add(warp);
//                x += SPACE;
//            }else if (item == '%') {
//                statueBottom = new StatueBottom(x,y);
//                a = new Area(x,y);
//                areas.add(a);
//                collidables.add(statueBottom);
//                x += SPACE;
//            } else if (item == '^') {
//                statueTop = new StatueTop(x,y);
//                collidables.add(statueTop);
//                x += SPACE;
//            } else if (item == '+') {
//                cobbleStone = new CobbleStone(x,y);
//                areas.add(cobbleStone);
//                x += SPACE;
//            } else if (item == 'z') {
//                specialTile = new CobbleStone(x,y);
//                areas.add(specialTile); //Displays HUD message for locked castle kdoor
//                tiles.add(specialTile);
//                x += SPACE;
//            } else if (item == 'd') {
//                dangerTile = new CobbleStone(x,y);
//                dangerTiles.add(dangerTile);
//                cobbleStone = new CobbleStone(x,y);
//                areas.add(cobbleStone);
//                x += SPACE;
//            } else if (item == 'I') {
//                pillar = new Pillar(x,y);
//                collidables.add(pillar);
//                x += SPACE;
//            } else if (item == '|') {
//                castleWall = new CastleWall(x,y);
//                collidables.add(castleWall);
//                x += SPACE;
//            }else if (item == 'H') {
//                a = new Area(x, y);
//                areas.add(a);
//                if(levelCount == 7 && !heartOnePickup)
//                {
//                    hert = new Heart(x,y);
//                    pickHearts.add(hert);
//                }
//                if(levelCount == 0 && !heartTwoPickup)
//                {
//                    cobbleStone = new CobbleStone(x,y);
//                    areas.add(cobbleStone);
//                    hert = new Heart(x,y);
//                    pickHearts.add(hert);
//                }
//                x += SPACE;
//            } else if (item == '@') {
//                castle = new Castle(x,y);
//                collidables.add(castle);
//                x += SPACE;
//            } else if (item == '!') {
//                a = new Area(x,y);
//                areas.add(a);
//                script = new Script(x,y);
//                scripts.add(script);
//                x += SPACE;
//            }
        }
        return models;
    }
}