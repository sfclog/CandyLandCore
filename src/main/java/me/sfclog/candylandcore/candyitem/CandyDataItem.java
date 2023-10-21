package me.sfclog.candylandcore.candyitem;

import me.sfclog.candylandcore.util.GetHead;
import me.sfclog.candylandcore.util.Random;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import java.util.ArrayList;
import java.util.List;

public class CandyDataItem {

   public static List<ItemStack> item = new ArrayList<>();

    public static void load() {
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODNkNDcyNzA0M2MxMzRkMmZlMjdjYzQxNWExOTQ5ZDZhNzcyZjEyZmMyMTU0Njg1ZGYwMTI1MGUxNjcwMTI3YSJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODcyNWQxMWZlMWQ3YmUxNjdlYzVjYzc2OTdjZGZjMjU1NzM3NzRlZTQxYjhjM2IzNzI2MWU0M2Q1ZDMxOGZjMyJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTY4NTNlYzFjNDBjOTI2ZTRhN2I1ZWQ1YTlkZDJjMGY2OTBiYzU4MzAyMTZjYjE4MmY1ZDkxODVjM2FhMjJlOCJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzY5MGQ0YjQ2M2VhYzM3ZmZkYWFiMmVhOGQzODQ2N2MxZWZkMWI4ZmU5MDZhNDQ3NTk5YzMxZWNiZDY5YTUyNCJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTkwNzkzZjU2NjE2ZjEwMTUwMmRlMWQzNGViMjU0NGY2MDdkOTg5MDBlMzY5OTM2OTI5NTMxOWU2MzBkY2Y2ZCJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjYzMzk4NGJmZmUxYzY0MjZhNmI0YTZiMzI3MDUyYjhmNTAzMDU2MmRjZjMwNmY0MmY0MDQ0Y2FkZjRlYjFiYyJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2YyZmZlMWM4OTUyYjEzMTIwMzQxZmY1MjQzOGQ0YTM4ZDdhMzYxMDU0Y2M3NDVjZmQ2YzE0ZmZhNTQyMjU0YyJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTljYjZlYjhhMjJhYzY3NzExZjA3YjkxZGNmYTE0OTIyZmZmYjYyZjIyZWJmOWMxYWRlYmE0ZWVmNDdmMDJiMiJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWJiMDU3MDQ4ZTYwMmIwNDc0ZjJhYzZiNjY4N2I0MDUwZDliMzI5NGY2MTkyM2JlNTAzMzIzYjQ4M2MxMTkzIn19fQ=="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjE3NTVmYjA0NDk4YzYyOWE1MzRhMTg4MjkwNWMzYWQ5MTFiZTJmNTI3YjgxZmU4YmI4NjBkMGM4YTczM2QyZSJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTc0YTdiMzUzMDQ4NTBmZmIwODI5YzU3MzA3ZDNmMDg4OTMzZGQ0NjliMmJhZDMzNTkyY2JkYWFmNzRhNDExYyJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDdlMzMzZDRiNzNmZmI2MDdjZjVhZTdkYzQzNDg1OTJmZmE3YTZkYzIzMzc1ZTdmYmQ4MTA0MmE1YWIxNTEyNSJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTRkYzY2NDY2Y2FkMmRhMTc0NmJkMmRkNjIwMDZjZTkzZDI3ZGU0NDgwNWY2ODEyNjQzMGY1NmQzZTg2ZTIxNiJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjVjYWMyMDQ5NzVkZmNiMGYyMGI0ODU5MGZiNjczN2VjNTBlYWM5NzQyMDk5YTZmYWZiZDY1ZWE1ODgwNGQ2In19fQ=="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGFhNjk0MDg0MmFmZDJhMmU1ZjQyMTc5MjM3ODU5OTU5ZTY2NmJiZmU3MmRhZWE4MTYxMmQ0NDFkOGUwNDM0OCJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzAyNmQ1NTBhNDAyNDc5ZjVmODM5M2Q2M2RmY2M5MGEyYmNlYjBlZDVlMzBhNGRjOGM0MjNjNGVjMzIxMjVkYyJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTJlZjM5NDM3ZDdkNDNhMDM0YzVhNDBiOTc0ZThkMmM2NzM0YTIxOGM3NjQ4NWQwNDkxMGY1MDdiZGMyZTgwOSJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTAwZWY2NDdhODVlMGE4MTBjYzkzZTMzZTZmNmRiOTdkNjE1YzlkZmYyNjVhZTk4MzE3OTliMWY3ZWZkOGNlMyJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWE1OGU0NDFiNWRhZGZhMDM3MTc2NTk3MzJlYTQ3NGQxMjQzMDE2ODg0MmMyYzFlM2EzNTMxMjJlZWVkMDMxNiJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTRmZjg4ZjIxZTAxNDljNGRlODlhYTMxYzdkYzBjZDM0MjljYjZjOWFiMjM3YmJmOTRiZjYwOTEwZjc4OWI5OSJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGIwMjM5OTY4YWViNDAzZTkwYzQ0N2M3ZjQ0ZWNmYjNiMzNhODdhMDg4ZGZhM2I5MGMyZjFjZjRkZjYyZWU5MiJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOThhY2JkMTMxNzgyZWY2ZDIyZmU0MTg3YWQ0NjlhMjNmYjc0OGMyNzAyMWQ5NjVhMDEyMWFkNjQ4MWRmNGQzOCJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTY2NmQxZmU3N2RiZDUzZmZhNzIxYjI1ZmYwNDg5MWRlODdjNjgzMDMyMGY3NjM4MDczYzVjMjU2ZTI0OWU0In19fQ=="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTRiOGE3MDBmN2ExN2JhZjQ4ZDA1N2E3ZDUzYjI2ZjM0ZDgxYmExMDNiNGRhNDc2OTExYTU4OWNhNjhmZDIzMCJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTAwYjFlZjE4NjBmMjI0MDdlOGRlMTFhMmY0ZjQwYmE1ZjE1MWU0Yzg4MWU3ZjA2OGQ3YjU4ZDY0ZDVjM2U1MiJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzNhOTliZGRlOTBjMWUyZjUwMGM2MWExZjQyNWFiNmNkZDlhYTU4NjZhY2ZmZmQ4NTRjMzQ2MDlhNTk3MTJlZSJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTBmMDI3NzgxMTg3NzI1MDVjYmE5Mjk1ZDdhOWM3MTEwN2ZhMDBlYjkxNDQ2ZTBhY2I4YWMwYWQzMDg5N2JlIn19fQ=="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmU2OWE5MDRhNjg1MmNjZjJlNGFkMTI3ODlkMTE5ZTA4N2M4Mzg3NjlkMzVmMGJmYTU2YzQxYTc1NTJhY2MzMSJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTNjNzU4YmFlNWIwMzY2MGQ4OGI0MWUxZjMzNWUwZTNkMmI3NjM2NjllNzY5ZGEwYjIwN2ZlMGI2ZDQ4MjAzZCJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWYzZjc0MzIzODc2Yzk2OTUzOGE4NWVlNDdkMzVjNzQzNzgyMzIzZWZmYmFiNWJkZjg5OTAxZDZiYzZjNjQ1OSJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTNhNWZjYzFlYjc4NGEzN2M0MjE1NmRmMDU4YjQ0ZjdlYjdlYzNkNTBkMWI5MTYxYTg1YTNjNjA0MTY1ZDBhZiJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzE3N2YxNmI5MDM5MTIyZTM0Y2JlODg1NjA5Y2IxMmU3M2Y1NTA0N2QxZWJlOTc0ODZiMDk5MDViMDllMzk0ZSJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGE5YjFjMTJhZWY1ZjM3M2ZmOTIzNmRhZGI5Zjc3N2EyZTQxNDI2MWYxYmJmOTgxNjcxNDg4NGU1MmFjMzI3NSJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWZhNThiNGE0MzMwOWM0YWJiNGVkMzU1NDQ4NmZkMWJiOTUyY2MyNmFmMDlkZTZiYmRmNDYxZDMwNDkzMGU4MyJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmNmNjQ4ZDcyYjQwZTYxYmE2YWMyMzI3N2M2ZGVlOTdlMzg0MDEwYWMwMzI0MDFiZGUxOWVmYzAyYmRmNDgwZCJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTYzZjFjNWMyMTA1YWRiZDZlNWIwNTIwNDNiYjBhNGJkNjJmNjQ3OGU2OTUwOTc3ODkzMjdmNzgwODYzZmJlYyJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTUwYjU2ZTA0ZGJmYWMwMTMwNzNlN2MzNzk1MDU3NTMzNDE4MTZmMzVlNzZiZGFiZTQ4OWE4ZmNhY2U0ZTNkYiJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTcxODhiOTlmMWNiYjMzNDM4NWJiMGY2MzdhOTczZjVlNzE0OTU2MDdkMTMxMTgyMjdmMDk2ZWQ5ZjE1NWIzZiJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWM1YjBlY2MwODI4YWIzZTEyYmE5OTY3OWIxZDQzNTI3MjBkYWZiM2IzMTQ0NDllYzliYjA3ODhjMGYwZmI3MSJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmIxYzM1YjA0YjdiZjc2MTYxOTg2M2M4MGQxOWQwZmQzMzllZjRlZjY0NzAxZmQwZWE1ZWQ4NGFhNTQ3MGNjYyJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmViNGRlNzQyMzAxYjNiZDAwY2Y4YmU5ZjZkYzM2OWY1YTZjZWM5ZTExODk0NDQzMmM1NWIyNzhhZmUzOTZhZSJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWIyYTZmOGZiNWQ3OGJiYmY2NTdlM2UxMmFjYmEzNmU3YWQzOWE3Y2EyZGUzNTQxYjY5ZmYyMTJlZTQxZjMifX19"));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGI4OTQyYjIyZGRkMjQ0MWYyY2U2YWQ2NTY3Zjg3NzRhOTdjYTZiMmE4MzJhM2FhZjVlNWNjNmJhY2JmIn19fQ=="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzJlZDMwYmQwNjE0NTgyODA1ZTQyMGU3NjMzNDYyYjc4OGM1OTVkNTM3NTY5Nzg0NjJiZTJmMjgxYzIwZWM3NCJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmFjYTAyMGNlNDRmMTEwYzgzODQxNWIwY2VhYzY2ZGQyMWFjOTE3NGVlZDZlOWNiYWFmMGZiMmQ4MDA5NzE1ZCJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODEzOWIyYTI5NWI0NWZkNDJjOTZlZjMxMDk0NGM5NjhmZTY1M2Y5OWI5YTRhZTdjYmRjZGMwMzBlZGRiZWQ4NyJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzAzZjRhYzc5OGQzYmY3ZmRlMzA1OGI2MjkxZDhjYzBlMGExN2NlYTFlMTBiZGE1MWYzMTliMzQwZmNiZmY5NCJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmE0MTM4ZTAxMGFhNmM4MTFlNDY2OTE1MzAyOWUwNDk0YjZlMDY4M2Y1M2JjOGFiMmI4NGNlOGM2ODQ5YjcwMiJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOThlNjlmYmRmYjNmZDlmMGM2OWE3MTkwNjYxYjhhNjZjNWFiODUxNmQ0YjExZDFiZGM4NGM1Yjc1M2U3MzVjIn19fQ=="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODA1NTk0NzA3ZjE1MWNlNWVlODE2M2RmNGI0MTg2ZGNkNzk3NThmMzcxNjU5NDAxY2NjZGU0MTIwMmNlMiJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjZjNjViZjI3YjgzZmMyZDJkMTdjMDY2OTg5OTE4M2NkZWRiNTU1NjQyYWVlYjgyYjU3ZWRkNmVkMWFkYTRmMCJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGFlY2U0MmQ1ZWFkZGQ2ZmM5MTU4YjY0YTgzZTc0Yjk0NTQ3ZWUxYjM2YWJjZTQ0NTFiNWM4Nzg4OWI0MTdiNSJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzY4ZDcxNmEyMGYxNzE4YzQ0NzhhOWU5ZDQyM2E0ODYwMTQzYzI3NzNiZTU5YzljOWQ2OTg0ZTg0MzExNTUifX19"));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODZkYjVlZDY2MDZjZDQ2MzkxNGNhZDZmZDlkYWRjMTQ2NGE1MTVlMjFhYTMxNmE1ZDZhZGY4MzE0YWY5Y2QifX19"));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2VjZDVlODQ4MDIxNGJkNjMzNzU2ZTYxOTJlMTQ3M2NlMjZhYWJhN2E2ZmI4MmY1OTE4ODBhYjQ4Nzc1NjMifX19"));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM2MWE3ODQ3YjhjMWQwOGRlMDQzOGQ1OGE1YTMyNDc1ZDYxNzI4YTNkNjUxNDk4ZmU4NjdiZDVkNTk4In19fQ=="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDEwODE4MzBlNjQ0ZDI5ZWUxOTRiZDY1ZTc0MDk5ZmI5NzQ3ZGE4YzNkODgxN2Y5NDgyOWU2NWNmY2U0OWEifX19"));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTc3NTJiZGNjYWQ2YTQ2NzhiNmVhYTU5MjM3MzhhYTYzZDBiNzUxNzE4MDMyOTIxNmYwYWEzNGZlYjU1ZWIifX19"));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTM3NjVmM2RiZTViZDE0ZDRmMWNiOTdlNTAxY2UyNDExNmVjYTg4YzNkYWRmNDYzMjE3MzVlZTgxNDFmNyJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWI2NDk2YThlNjEwNTBjNTlhYjgyN2I0ODhlOWEyNThjODk1Yzk2ZDlmZDlkOTQ4MGE0ZGI0OWZjODk4YzU2In19fQ=="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmIyMTYxN2QyNzU1YmMyMGY4ZjdlMzg4ZjQ5ZTQ4NTgyNzQ1ZmVjMTZiYjE0Yzc3NmY3MTE4Zjk4YzU1ZTgifX19"));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWYzNTM4ZjgzY2M0Njc0YmYxMTRhOTRjNzRjNDEwOWE2YWQ2NWE4NmFmZWM4N2MyY2M1ZWJmNmI5OTM4NTE0YiJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWVkNTUyNjBkY2NjOGRhNTkzMzhjNzVlNDFkNTQ0YTJlMWU3ZGJlZjMxYTY5ZmU0MmMwMWIzMjk4YmYyZCJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDg1NTI1NTY0Y2I3Yzg4ZGU0ZmU5NDZiOTIyMGM0OWRkODk5MzJiMzllNzZiMzk0NTcxNWFkMzA0ODIzYzEzZCJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGM1MGFlZTg4MDEzZThmYWY0MjdlMTlmM2I4OTgyOGI4NmJiZjAzZGQyZjE3YzRjNzYwZDFkZGUyMmRlMyJ9fX0="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmFjZmM3ODY0NjllNjM2YmY0ZWFhYzJlZDQ5ZDlhNmM1MjEyYWY2ZDkwNzFkOTYxOTQ0YmU4YTkzNWY0NzhlIn19fQ=="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODE5Zjk0OGQxNzcxOGFkYWNlNWRkNmUwNTBjNTg2MjI5NjUzZmVmNjQ1ZDcxMTNhYjk0ZDE3YjYzOWNjNDY2In19fQ=="));
        item.add(GetHead.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2M5Y2M5YjU0OTcyODRjYTc1YTBjMGE2NzExMzE2MjUxZmI3YzYzYjcyODI5MDhiZmZlNjI1N2RkYzM0MSJ9fX0="));

    }

    public static ItemStack getRandom() {
         if(!item.isEmpty()) {
            return item.get( Random.getRandomNumber(0,item.size() - 1));
         }
        return new ItemStack(Material.AIR);
    }


}
