package enum_use;

public class showSeason {

    void show(useEnum a)
    {
        switch(a)
        {
            case fall -> System.out.println("��Ҷ");
            case spring -> System.out.println("����");
            case summer -> System.out.println("����");
            case winter -> System.out.println("Ʈѩ");
        }
    }
}
