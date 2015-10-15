package gr.reunion.debug;

import gr.reunion.events.engine.main.base.MainEventInstanceType;
import gr.reunion.interf.PlayerEventInfo;
import gr.reunion.l2j.*;
import java.io.PrintStream;
import java.util.*;
import javolution.util.FastList;
import javolution.util.FastMap;

public class Test
{

    private static int next = 0;
    public static FastMap _tempPlayers;
    public static List _teams;
    public static int _vipsCount = 5;
    public static int _chooseFromTopPercent = 30;
    public static Comparator compareByLevels = new Comparator() {

        public int compare(PlayerEventInfo o1, PlayerEventInfo o2)
        {
            return 0;
        }

        public volatile int compare(Object x0, Object x1)
        {
            return 0;
        }


// JavaClassFileOutputException: get_constant: invalid tag
    };
    public static Comparator compareByPvps = new Comparator() {

        public int compare(PlayerEventInfo o1, PlayerEventInfo o2)
        {
            return 0;
        }

        public volatile int compare(Object x0, Object x1)
        {
            return 0;
        }


// JavaClassFileOutputException: get_constant: invalid tag
    };

    public Test()
    {
        super();
    }

    public static void main(String args1[])
    {
    }

    protected static void partyPlayers()
    {
    }

    protected static void partyPlayers(List list)
    {
    }

    protected static void selectVips(int i, int j)
    {
    }

    protected static void dividePlayersToTeams(int i, FastList fastlist, int j)
    {
    }

    protected static void reorganizeInstances()
    {
    }

    protected static void init()
    {
    }

    protected static String createPlayer(int id)
    {
        return null;
    }

    protected static void reorganize(List list)
    {
    }

    protected static int movePlayers(MainEventInstanceType target, MainEventInstanceType source, int count)
    {
        return 0;
    }

    protected static boolean hasEnoughtPlayers(MainEventInstanceType instance)
    {
        return null;
    }

    protected static boolean isFull(MainEventInstanceType instance)
    {
        return null;
    }

    protected static void dividePlayers()
    {
    }


    // Unreferenced inner class gr/reunion/debug/Test$3

/* anonymous class */
    static class _cls3
        implements Comparator
    {

        public int compare(MainEventInstanceType i1, MainEventInstanceType i2)
        {
            return 0;
        }

        public volatile int compare(Object x0, Object x1)
        {
            return 0;
        }


// JavaClassFileOutputException: get_constant: invalid index for tag
    }

}
