package br.com.alura.aluraviagens.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class ResourceUtil {

    public static final String DRAWABLE = "drawable";

//    pacote.getImagem()       ->   Nome da imagem do pacote.
//    "drawable"               ->   Tipo do resource que será buscado.
//    context.getPackageName() ->   Pacote base para buscar o recurso.

    public static Drawable devolveDrawable(Context context, String drawableEmTexto) {
        Resources resources = context.getResources();
        int idDoDrawable = resources.getIdentifier(drawableEmTexto
                , DRAWABLE, context.getPackageName());
        return resources.getDrawable(idDoDrawable);
    }
}
