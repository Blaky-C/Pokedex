package com.hfad.pokedex2;

public class Pokemon {
    private String number;
    private String name;
    private String type;
    private int rawImageId;
    private int tabImageId;
    private int moImageId;

    public static final Pokemon[] pokes = {
            new Pokemon("001", "妙蛙种子", "GRASS & POISON", R.drawable.poke_001, R.drawable.tab_001, R.drawable.mo_001),
            new Pokemon("002", "妙蛙草", "GRASS & POISON", R.drawable.poke_002, R.drawable.tab_002, R.drawable.mo_002),
            new Pokemon("003", "妙蛙花", "GRASS & POISON", R.drawable.poke_003, R.drawable.tab_003, R.drawable.mo_003),
            new Pokemon("004", "小火龙", "FIRE", R.drawable.poke_004, R.drawable.tab_004, R.drawable.mo_004),
            new Pokemon("005", "火恐龙", "FIRE", R.drawable.poke_005, R.drawable.tab_005, R.drawable.mo_005),
            new Pokemon("006", "喷火龙", "FIRE & FLY", R.drawable.poke_006, R.drawable.tab_006, R.drawable.mo_006),
            new Pokemon("007", "杰尼龟", "WATER", R.drawable.poke_007, R.drawable.tab_007, R.drawable.mo_007),
            new Pokemon("008", "卡咪龟", "WATER", R.drawable.poke_008, R.drawable.tab_008, R.drawable.mo_008),
            new Pokemon("009", "水箭龟", "WATER", R.drawable.poke_009, R.drawable.tab_009, R.drawable.mo_009),
            new Pokemon("010", "绿毛虫", "BUG", R.drawable.poke_010, R.drawable.tab_010, R.drawable.mo_010),
            new Pokemon("011", "铁甲蛹", "BUG", R.drawable.poke_011, R.drawable.tab_011, R.drawable.mo_011),
            new Pokemon("012", "巴大蝴", "BUG & FLY", R.drawable.poke_012, R.drawable.tab_012, R.drawable.mo_012),
            new Pokemon("013", "独角虫", "BUG & POISON", R.drawable.poke_013, R.drawable.tab_013, R.drawable.mo_013),
            new Pokemon("014", "铁壳昆", "BUG & POISON", R.drawable.poke_014, R.drawable.tab_014, R.drawable.mo_014),
            new Pokemon("015", "大针蜂", "BUG & POISON", R.drawable.poke_015, R.drawable.tab_015, R.drawable.mo_015),
            new Pokemon("016", "波波", "NORM & FLY", R.drawable.poke_016, R.drawable.tab_016, R.drawable.mo_016),
            new Pokemon("017", "比比鸟", "NORM & FLY", R.drawable.poke_017, R.drawable.tab_017, R.drawable.mo_017),
            new Pokemon("018", "比雕", "NORM & FLY", R.drawable.poke_018, R.drawable.tab_018, R.drawable.mo_018),
            new Pokemon("019", "小拉达", "NORM", R.drawable.poke_019, R.drawable.tab_019, R.drawable.mo_019),
            new Pokemon("020", "拉达", "NORM", R.drawable.poke_020, R.drawable.tab_020, R.drawable.mo_020),
            new Pokemon("021", "烈雀", "NORM & FLY", R.drawable.poke_021, R.drawable.tab_021, R.drawable.mo_021),
            new Pokemon("022", "大嘴雀", "NORM & FLY", R.drawable.poke_022, R.drawable.tab_022, R.drawable.mo_022),
            new Pokemon("023", "阿柏蛇", "POISON", R.drawable.poke_023, R.drawable.tab_023, R.drawable.mo_023),
            new Pokemon("024", "阿柏怪", "POISON", R.drawable.poke_024, R.drawable.tab_024, R.drawable.mo_024),
            new Pokemon("025", "皮卡丘", "ELECTRIC", R.drawable.poke_025, R.drawable.tab_025, R.drawable.mo_025),
            new Pokemon("026", "雷丘", "ELECTRIC", R.drawable.poke_026, R.drawable.tab_026, R.drawable.mo_026)
    };

    private Pokemon(String number, String name, String type, int rawImageId, int tabImageId, int moImageId) {
        this.number = number;
        this.name = name;
        this.type = type;
        this.rawImageId = rawImageId;
        this.tabImageId = tabImageId;
        this.moImageId = moImageId;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getRawImageId() {
        return rawImageId;
    }

    public int getTabImageId() {
        return tabImageId;
    }

    public int getMoImageId() {
        return moImageId;
    }
}
