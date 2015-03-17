package org.bitcoinj.core;

import com.subgraph.orchid.encoders.Base64;
import org.bitcoinj.kits.WalletAppKit;
import org.bitcoinj.params.TestNet3Params;

import java.io.File;

public class MultiSigTransactionOutputTest {

    public static void main(String[] args) {
        System.out.println("WAT");
        WalletAppKit kit = new WalletAppKit(TestNet3Params.get(),
                new File("/Users/dwuziu/Work/UltraCoin/client/testing/UltraCoin-matt-rebuilt"), "com.google.bitcoin.params.TestNet3Params");

        kit.startAndWait();
        Transaction tx = new Transaction(TestNet3Params.get(), Base64.decode("AQAAAAJJOsb9as0fgv76WxymkQrvBzNVl9gxR8ys+QLKO2YiowAAAABJAEcwRAIgVrTLJdZqwSxV+5vvkGe0ZaMUlXc+KI1aP8lOUaQUmVkCIC4NSrFQ0QOPhHm1D92oFNz5Po+gNF1JdDJZQhqFomg9Af////9fCkI/3Qg9uvKAp0auy4dqZ9uEHJ23Eqho4Fmop2BwuwAAAABJAEcwRAIgP+MdtY+eGx9CvioehkLZ3bJ4c4Iz1+wnO54VbLpgQIICIBya3JO4srNgFGstf23riMfzzTMylCUEC+6bHpbX5nuYAf////8B5sABAAAAAABpUiEDkUzRCaoQSeWuGQAB/eX2RxYROtHZBvTYc4YKy1/4z9EhA4EiiEmI9vU8KtAXTk6imHXhNxszcYUstSCmOFdQqpAEIQNUC+HDI+VK049FoS1C1An7eY+rcVUVWdL+q/KsRzrv/FOuAAAAAA=="));
        for (TransactionOutput output : tx.getOutputs()) {
            System.out.println(output.isMine(kit.wallet()));
        }
    }

}