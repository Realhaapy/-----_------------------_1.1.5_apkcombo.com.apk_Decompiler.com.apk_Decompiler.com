package f.e.c.a.z.a;

final class m1 {

    class a implements b {
        final /* synthetic */ i a;

        a(i iVar) {
            this.a = iVar;
        }

        public byte a(int i2) {
            return this.a.h(i2);
        }

        public int size() {
            return this.a.size();
        }
    }

    private interface b {
        byte a(int i2);

        int size();
    }

    static String a(i iVar) {
        return b(new a(iVar));
    }

    static String b(b bVar) {
        String str;
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i2 = 0; i2 < bVar.size(); i2++) {
            int a2 = bVar.a(i2);
            if (a2 == 34) {
                str = "\\\"";
            } else if (a2 == 39) {
                str = "\\'";
            } else if (a2 != 92) {
                switch (a2) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (a2 < 32 || a2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a2 >>> 6) & 3) + 48));
                            sb.append((char) (((a2 >>> 3) & 7) + 48));
                            a2 = (a2 & 7) + 48;
                        }
                        sb.append((char) a2);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    static String c(String str) {
        return a(i.m(str));
    }
}
