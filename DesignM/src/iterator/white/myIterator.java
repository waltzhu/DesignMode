package iterator.white;

public class myIterator implements iterator {
	public myAggregate agg;
	public int index;
	public myIterator(myAggregate agg) {
		super();
		this.agg = agg;
		this.index=0;
	}
	@Override
	public void first() {
       this.index=0;
	}
	@Override
	public boolean isTail() {
      if(this.index>(this.agg.getSize()-1)){
    	  return true;
      }
      return false;
	}
	@Override
	public void next() {
		if(this.index<=(this.agg.getSize()-1)){
			index++;
		}else{
			index=this.agg.getSize()-1;
		}
	}
	@Override
	public Object getCurrentItem() {
		return this.agg.getCurrentObj(index);
	}
}
