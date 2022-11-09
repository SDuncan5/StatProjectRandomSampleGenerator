import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //arrays of possible values

        //easy
        String[] easy = {"Although it wasn't a pot of gold, Hailey was enthralled at what she found at the end of the rainbow.",
            "The stench from the feedlots permeated the cars despite having the air conditioning on recycled air.",
            "The parents handed each child a map at the start of the road trip so they could find their way home.",
            "Every store manager should be able to recite at least fifteen nursery rhymes backwards and forwards.",
            "The newly planted trees were held up by wooden frames in hopes they could survive two future storms.",
            "I thought reds would have felt warmer in summers but I didn't think about the equator or my sweater.",
            "She looked at the masterpiece hanging in the museum but all she thought was her son could do better.",
            "He stepped gingerly onto the bridge knowing that enchantment and suspense awaited on the other side.",
            "The group quickly understood that toxic waste was the most effective barrier to use against zombies.",
            "It's comforting to know that your fate depends on something as unpredictable as the popping of corn.",
            "We have young kids who often walk into our room at night for reasons including clowns in the closet.",
            "The clock within this social blog and the clock on my laptop are one hour different from each other.",
            "She would only survive if she kept the fire going strong and she could hear thunder in the distance.",
            "The urgent care centers were filled with patients after the news of a new deadly virus was revealed.",
            "It was difficult for Mary to admit that most of her workouts consisted of exercising poor judgement.",
            "She's never entirely happy until she finds something to be unhappy, following that she is overjoyed.",
            "Had he known what was going to happen after he went in, he would have never stepped into the shower.",
            "Sometimes I stare at a door or a wall and I wonder what is this reality, and what is this all about?",
            "She learned that water bottles are no longer just to hold liquids, but they are also status symbols.",
            "She wanted a secret agent pet platypus, but ended up getting a duck, a ferret, and a lizard instead."
        };

        //medium
        String[] medium = {"Ow! Wh3n I w4s little I had a c@r door sl9mmed 5hut on my hand & I still* rem6mber it quite v1vidly?",
                "L1ghtni7g P4r@dise wa5 the l*cal hang-o4t join+ where th3 group usu@lly end^d up $pend1ng the night!",
                "As the y3ars pa55 by, w3 a\\\\ kn^w owner$ look m0re & mo(e l!ke th3ir dog$! ILov3D0goos92@hotmail.com",
                "Sh3 traveled b3cause it c0st the sam3 as therapy and was a l0t more enjoyable with the # of friends.",
                "S0m3times I star3 at @ d00r and I w*nder wh@t is thi3 reality, why @m I aliv3, and w9at is t9is @ll?",
                "Sh3 w0rk3 tw0 j@bs t* m@ke end^s meet; at l3ast, th@t w#s her r3ason for not hav!ng t!me t0 j0in u5.",
                "H3 !s g00d at e@ting p!ckles an9 t3lling w0m3n ab0ut h!s em0tion@l pr#blems bu! it sc^res th&m aw&y.",
                "If my c@lculat0r? had @ h!st0ry, #it w0uld be m&re emb&rrassing^ th8n my own br0ws3r h!5toRy is now.",
                "Wh3n ! c00k sp@gh#tti^, I l!ke to b0il it a f3w minUte5 p@st al d3Nte so t4e n00dles 4re slippery!!.",
                "H3 had t0 turn in the r3search paper^ due ne&t Frid@y; otherw!se, he w0uld not h@ve pa55ed the class?",
                "Writin6 @ l!st 0f rand0m s3nt3nces !s much m0re challenging th&n I initiall77 thought ^it would be.?",
                "The hu6e <lock with!n thi$ blog @nd the clo<k on my l@ptop are 4:35 hours diff3r3nt from 3@ch other.",
                "The <omplic@ted math3matics homew/rk l3ft the pAreNtS tr^ing to h*lp their #$!* kids qu!te confu$ed.",
                "The^ n3wly pl@nted trees' were h3ld up &y wo0den frAme5 in h^pes they c0uld sur^i^e the ne#t storm.!",
                "I had @ friend in h!gh school naMed R!c Shaw, but h# was fairly us3le$s as @ mod3 of transp0rtation.",
                "Sh3 wasn't su7e whet4er to feel impr3ssed or c#ncerned that h^ folds und!es in neat l!ttle pack@ges.",
                "She d!d a ha88y d@nce because all of the s0cks from the dryer m@tched, wh!ch was rar3 for her t0 do.",
                "For s0me rea$on, the re$pon$e t3@m d!dn't consi6er @ lac< of mil< for my ce%eal as a 4eal emer6ency.",
                "H3 decid3d that the t!me had ne^er c0me to be stron9er than any of the e#cu$es he'd u$ed unti] t4en.",
                "He le@rned th3 har9est le$son of h!s l!fe and h@d the scars, both phys!ca] and men[al, to pr0ve it!!"};

        //hard
        String[] hard = {"mT)j33%;JJmLDTL!c/3:Hq{Q!Y-AEK?9z!m_EB{A2#(@Rm-CPGjCLh[xBu/i/*,7)yNdx(Mej*FR#$W(DA*NLc2Hycgceg;xVf-]",
                "}qNF;!a9w!@=4Hm#U#E.yZFDLX_zp44$T,N#Ey4zjx(Y4h{ck@By@3ba;c8piw.f[m*=5i*pTjkf@yWd)V(n@&MBhZ$*:!e!V@YW",
                "+EJYW}Ub{BA$(/MPbJ9}(447#7*)i;M}Y{&GDgVwE/vGDFA:n=-S_/Z@&n=g=-ix;QXj{Na?QJZ(5Z8ANSw63@86*RyU5#rMzNBm",
                "2DR]+RC&+nqMRx{in!ZC}kVSzRZf6}hj+H;Hw(i+,q@UQf3ArbAp%-;neD,e@vv8M69&a/.{uT$Svf.Xjzqmad%$7.Sx},9bLhC4",
                "_qUzCdCyMD%XEF5Mjin3!agTDiQ_&n=;7&kz)j:T!YxZ7xHmT.QGxS37%Ln/u6f=G[T:ttr3aLrPDmGN;!Gidhx(B{B]]25MrZyH",
                "mah_6c,KuUP/pUcr=DXd#N)J[{EeZ:x[eP9ZS78RN6nR4p#*{Ja@x9c+Bq:,$7%rERD_W/S9@ehT7ejEzNZHVU[YjC5dU,a($W&g",
                "fy*#vh$ipN-h$yT=zCZcN]e(aZ=,[v}Bua_2:M*u%*E$]yr_6zc+i8(aZa!EMFF8Lc6Q76H{8FWkW!EwB2g#StMF&r[y=CFjvv-G",
                ";}nqE#B[%SvfZw};x2qKZarv=q4SG8{jhHV9.at?E[@PJxYLJJ%hJ=x3r5KKx3qwCvcYGu!z4FRZt27+?=@]Dyq$EN_M.P{A@t_%",
                "x;urf}4hUS,;;dLJjFzN!8b67%U2vM.*62FJ[#FzW7%b*JZj(.6t&DNU;G5i;iEUtk!8e9jK98:_32NEhqk(2a-iYuXLJ]-KjNXq",
                "Zj{QG@zh.V5DBM7D/3z9*+uc[;PjjZ(ejQK%SDk&WV&K=,Rp.7X&bYhH7BxuS_A{Sd}+F8;26VCdzAR[hJk{5h*$%PnVqfHjQ?JG",
                "LE6z)r%&3u@2z)cAvR=Fa/UrBW=C?N#dceWg/8U(z$A2F8_ztWQ./2WQx$cgK*;Jeam*2[J,;9A&Eb[RnAS}umJ3-4%n8(Fkt3*R",
                "nr)BbG@mm{]m@4Kkvk[$&vvQ&Kp+uEt8t9m;z$dJ*B;2TEjj3SB%Y&9=m2W!aRmg-JJq=Cr8iE2Pz!Pbgg/Tm:{v)(?ucN?,&5!?",
                ")dkp:39EQ72Gn?@:nd%QmPt=ty=B2rn5VdYaVr[i$bz#uN_dM=C(=2+Jf(-!HGMagmfNC4E.ZG8&)e/z=t2{V:cpFBkSX8eD+XB(",
                "H.;+xcgXENx*MhfDhx&7!*(97M9qSuS]VTma[r_ZVtL-jwhqUE6q:.giA5?Yx:mR=g4YwTK=}G#}[KpN{59%iz%D7.r:j_Qd/PE$",
                "{C9KZyaL43Qmzw:U{W@7PtJycB.Xc/KdhF2,.6a2b$ue$5uvndidY[*5!?!yyb},T@cj6-vj-V=g+/vX-6Q}B:(}29{,7N(_4yg.",
                "C/:L!T:j_LUyQQc#U:PJEQ:7&6r4$NDcc@wgvuiVp-:6Jn?6rz)V5v.CC%X$tuh$eB2=RX2Zgj&tY+eUtF37-(CZb/pZ{EGVTE2-",
                ";$k)rECy4%T.F):A:Kc4g7QH]gA@i2B2}Mb)4v7*UJ$_fyLgT2Ai+iJ{A=rS#pr_BNdk7=Y.-jrT}iz)V27GG7M@ck/7-]A+8/AE",
                "f3/&9iXXzB7cMK99?g!QJ#rrkx8f?;**PYicC8wEr?K+8vfu@/DnGNi{&)QDz6_W+E7.gRp)fJu!4c8h))_6*iH5))Ycv9UbiErz",
                "qRxV+!e(iq%%na7P4JZ@L.7&V8&M-Z.$q3ht#z{,8eGFjW8c!6[N.ux+]y8r}Sejv-7*ZLUi726(2BG{4t%uaH2wXF(Rm9(u2Xmt",
                "R##P@Dr-&)EvST7)5)ATBGydSXF}h%i}&Q-%u))DcpSRDGR?MkWpPbLtV(-,i=tT=cR[SAbvD9(}Aem!zZ$[M.fQepNL89A#bnLE"};

        System.out.println("Which difficulty? e, m, or h");
        String diff = scan.nextLine();

        //generate 3 random numbers between 1 and 20
        Random rand = new Random();
        String result = "";


        if(diff.toLowerCase().equals("e")){
            for(int i = 0; i < 3; i++){
                int randNum = rand.nextInt(20);
                result += easy[randNum] + " ";
            }
        }
        else if(diff.toLowerCase().equals("m")){
            for(int i = 0; i < 3; i++){
                int randNum = rand.nextInt(20);
                result += medium[randNum] + " ";
            }
        }
        else if(diff.toLowerCase().equals("h")){
            for(int i = 0; i < 3; i++){
                int randNum = rand.nextInt(20);
                result += hard[randNum] + " ";
            }
        }
        else{
            System.out.println("Please type only \"e\", \"m\", or \"h\" to indicate difficulty.");
        }

        System.out.println(result.trim());




    }
}