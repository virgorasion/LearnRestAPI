package widyanto.fauzan.learnrestapi;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by M Nur Fauzan W on 25-Aug-18.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    public ArrayList<ActorsItem> listActors = new ArrayList<>();

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_actors, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MainViewHolder holder,final int position) {
        holder.txtName.setText(listActors.get(position).getName());
        holder.txtChildren.setText(listActors.get(position).getChildren());

        Glide.with(holder.itemView.getContext()).load(listActors.get(position).getImage()).into(holder.imgProfile);
    }

    @Override
    public int getItemCount() {
        return listActors.size();
    }

    class MainViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.img_profile)
        CircleImageView imgProfile;
        @BindView(R.id.txt_name)
        TextView txtName;
        @BindView(R.id.txt_children)
        TextView txtChildren;

        public MainViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
