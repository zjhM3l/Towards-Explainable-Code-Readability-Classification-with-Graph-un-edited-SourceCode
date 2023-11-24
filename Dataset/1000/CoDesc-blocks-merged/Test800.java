class Test {
    public class Example {
    public void chargeSpecificBill(Biller biller, Resident resident, BigDecimal amount) {
            Map<Biller, BigDecimal> originalDebtMap = getOriginalDebtMap(resident);
            
            BigDecimal originalOwed = originalDebtMap.get(biller);
            if (originalOwed == null) {
                originalOwed = BigDecimal.ZERO;
            }
            originalOwed = originalOwed.add(amount);
            originalDebtMap.put(biller, originalOwed);
            
            resolveLoan(resident);
        }
        protected void addAboveAndBelowEdges( Pair<T, T> addedEdge ) {
            assert addedEdge != null;
            // add the "above"
            SortedSet<Pair<T, T>> set = this.verticesAbove.get( addedEdge
                    .getSecond() );
            if( set == null ) {
                // create the set
                set = new TreeSet<Pair<T, T>>();
                this.verticesAbove.put( addedEdge.getSecond(), set );
            }
            set.add( addedEdge );
            // add the "below"
            set = this.verticesBelow.get( addedEdge.getFirst() );
            if( set == null ) {
                // create the set
                set = new TreeSet<Pair<T, T>>();
                this.verticesBelow.put( addedEdge.getFirst(), set );
            }
            set.add( addedEdge );
        }
        public String getTagFilter(String tagName) {
            Object o = tagFilters.get(tagName);
    
            if (o == null) {
                return "";
            }
            return (String) o;
        }
    }
}