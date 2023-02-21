package enum_use;

public class showSeason {

    void show(useEnum a)
    {
        switch(a)
        {
            case fall -> System.out.println("ÂäÒ¶");
            case spring -> System.out.println("·±»¨");
            case summer -> System.out.println("ÑÞÑô");
            case winter -> System.out.println("Æ®Ñ©");
        }
    }
}
