import android.widget.ImageView;
import android.widget.TextView;

public static class ToyViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivToy;
    private TextView tvName;
    private TextView tvPrice;

    public ToyViewHolder(@NonNull View itemView) {
        super(itemView);
        ivToy = itemView.findViewById(R.id.ivToy);
        tvName = itemView.findViewById(R.id.tvName);
        tvPrice = itemView.findViewById(R.id.tvPrice);
    }

    public void bind(Toy toy) {
        // ivToy.setImageBitmap(toy.getPicture());
        tvName.setText(toy.getName());
        tvPrice.setText(String.valueOf(toy.getPrice()));
    }
}

