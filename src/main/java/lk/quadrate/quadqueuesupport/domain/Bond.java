package lk.quadrate.quadqueuesupport.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Bond implements Serializable {

    private String bond;
    private Chain chain;
    private Subject subject;

    public Bond(String bond, Chain chain, Subject subject) {
        this.bond = bond;
        this.chain = chain;
        this.subject = subject;
    }
    public static BondBuilder builder(){
        return new BondBuilder();
    }
    public static class BondBuilder {
        private Long id;
        private String bond;
        private Chain chain;
        private Subject subject;

        BondBuilder() {
        }
        public BondBuilder chain(Chain chain){
            this.chain=chain;
            return this;
        }
        public BondBuilder toSubject(Subject subject){
            this.subject =subject;
            return  this;
        }
        public BondBuilder withBond(String bond){
            this.bond = bond;
            return this;
        }
        public Bond build(){
            return new Bond(this.bond,this.chain,this.subject);
        }
    }


}
