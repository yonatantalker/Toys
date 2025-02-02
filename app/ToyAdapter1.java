public class ToysAdapter1 extends RecyclerView.Adapter<ToysAdapter.ToyViewHolder> {

        private Context context;
        private Toys toys;
        private int single_layout;


        public ToysAdapter1(Context context, Toys toys,single_layout) {
                this.context = context;
                this.toys = toys;
                this.single_layout =single_layout ;
        }

        @NonNull
        @Override
        public ToyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                return null ;
        }

        @Override
        public void onBindViewHolder(@NonNull ToyViewHolder holder, int position) {
                Toy toy = toys.get(position);

                if(toy != null)
                        holder.bind(toy);
        }

        @Override
        public int getItemCount() {
                return (toys == null) ? 0 : toys.size();
        }


        public static class ToyViewHolder extends RecyclerView.ViewHolder {

                public ToyViewHolder(@NonNull View itemView) {
                        super(itemView);
                }
        }
}
