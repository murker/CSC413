package t4.csc413.smartchef;

import java.util.ArrayList;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by MG
 * This adapter provides access to the data items.
 * Class also handle how classes that extend NavBaseActivity are involved with showing
 * the navigation drawer.
 */

public class NavDrawerAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<NavDrawer> navDrawers;

    public NavDrawerAdapter(Context context, ArrayList<NavDrawer> navDrawers){
        this.context = context;
        this.navDrawers = navDrawers;
    }

    @Override
    public int getCount() {
        return navDrawers.size();
    }

    @Override
    public Object getItem(int position) {
        return navDrawers.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    /**
     *
     * @param position position of object on the drawer list
     * @param convertView View that is displayed
     * @param parent
     * @return Updated View that reflects changes to drawer
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater)
                    context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.drawer_list_item, null);
        }

        ImageView imgIcon = (ImageView) convertView.findViewById(R.id.icon);
        TextView txtTitle = (TextView) convertView.findViewById(R.id.title);

        //settings icons and title
        imgIcon.setImageResource(navDrawers.get(position).getIcon());
        txtTitle.setText(navDrawers.get(position).getTitle());

        return convertView;
    }

}
