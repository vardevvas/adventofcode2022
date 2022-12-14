import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day3 {
    static String[] input = { "dtddvvhwttHJhwdhJPddhwJGppmGjgpQgTjQplQpTljwpg",
            "BfzSzRSVVMVNRMDDNBSNSnfBmbrglGQbmNpQggFjpgpbQlQb", "ZSBffLnVZdCCPJjhhL", "RGCZpWWWFlHQQbgvFssg",
            "jLnMzjnrnjjNjhrjdwbHscsVVgDVQPvPwh", "nfJnLMLzjJMtnjNnnBbZtBWBqqbTTTBRpT",
            "nddlhBtqTBqTVSlBtmCmVcRVmZggfWbcZc", "jDjvPrPSNPwrDNRWbbgWCjRRCcWm", "DzDwSpFrvrvFPQLzQnsqztBthTJnGJqlsJ",
            "gssGmzwgRgsNmTsqgDnDJnbDHHhhzFdDDh", "WQVFjMWrVQrVvVVjVctSSLSMZhnJZPBnbdnhbnHZZBDJBh",
            "VCtcccVQLrfvrSlGmfTfNgfmlFgm", "DsmfsBbNNZhDWsbmWmNbbPDHLFjcctjjGcnZGzncnctcGH",
            "SwVQJrjVwpgSVRpjpVRrlTMCFFCLCFFcHzzGMcHrtHHH", "ppVwTwSwpwvSlSlJTjVVbPhsvvBssWsNfsqWPvWs",
            "BJwqwJtqqDDDrGDnPFzPFfpphD", "TgZscCHQLSHgZcfMzpjFFjzsshfj", "LcNlTVQCCVLLZTLNvpRtpvBBvRJmNB",
            "bDBGQBBCTTNPGPPwPzcHfVHrDtLWLVrWVjjHWr", "gpssqqsqlMFfLZQWftjVpr", "lvqqFMRlFcQvbzCNCG",
            "fhhMDdPhWMJMWvhhSfwRSGlzFbSFNlzw", "LcqTCqcgZqjTggVjcwbFRwbDBTzbRGRwTS", "cHLpZgnCHpQsDdsmQp",
            "jwStJjJhtgJStpgwJMggQWqQTNTfNTWfbNNMCCNG", "zRZnFPRZPVncPGVFRlRmGHCTqfCCPCHHfLfbTQCbTq",
            "lnVmFZRZDnRVBFZcrZlhjpggvppthGhphpwprS", "lcttSptHHllQbMcsrltSQGpvNBzpgWBBBDDGWzvgLz",
            "PdjPVRFhFqFjRRCjzvRWnWLBLgbBBLzg", "hhCCFbPTmjPdhZjhPhZCmTjjMsrJSfHrcmHJrHHmlcJSsmft",
            "WhWnLZSSnSzQQhfLLNSfmDHrCFDDHtpjGGtTGQCG", "gJbJBcMVwJlRRdbwvwJBVtjdtHHTmptpHTCtTFrFCp",
            "JwwgvRMJlvJwgqgvqRMcnWWhLPzzsqfnZWnfWWnj", "zdwTSvzHMvVSzDCtZhtGmbTGhm", "lcBHfFjjgtsmDCgshD",
            "cJPBnqNFnLfHJFPqljclqJzQvSSVWvSnMwvSzSWWdMWM", "pNJMcZrsZDLDcbcccMpQffHqvgdwdFFmdmqwvqmgmzsw",
            "hhnWjTTStRCGSMgvvgvdqvdFjvVz", "hCTSWhPGttTCGBWMRlTCMSnPBDJpbDfDpNpbbNJfJDJbpJpN",
            "lbcQcSNFchhQNqHLLqhLqrMpqM", "WfsnsszPWfBBVpHdprrpdnGL", "WTzWfwjtTBzwwBDzmfSSQmmbFZcpQNcbZZbv",
            "PwSJSlmtPPgwgmHhPPvRvGHLRLQRBQGCQVGb", "rnsFDnnfGGRWQRnW", "dfTTfTFdfrfFFFzQFPJPSSlhqtllNPzgwS",
            "MMbTFZrcrGZMDqNStWScDtzS", "dvWmhQggQvCnfnqPqDnDjnfP", "lgvdvLClWCQlgdhlrMBBHpGlwbHHGH",
            "CQHgQpPdCQpsCpzRwSVRSzRZwZ", "JbNBbcbrJvbJnqVznwwTzrzz", "wNbfLvvfDNNBHPFLhddFsQss",
            "VVzqvwzpqvzqNVVHGNqjHpNfSQDWdWwJdPWrWccdQrWrrDdd", "nLcbtBRtBhcnWSJQlJSgll",
            "tFbLLLRRhMtsBMtRCRsLCMBVjjvHTNjHHjzcvFFppGHzTT", "QCPrPWNPlWjGGZqGmvdPGd",
            "JgpHpSfphhfpVmBSgnTvdtddGvZVdvddDv", "LhphBfHpSwSwfHcMgfpmBWWWbsNCjFWsljNbbjlLjb",
            "QJmQbRmdfmdSQRQZSJltTltNvTrtDtrlftDD", "wpZcHVwwMgBpWMVgWpHLphztDvvGvDPlnGvDLlNrDPnNPl",
            "McgWFWHHHzVpMgZQFqbjsdjqqRCq", "JPhLFfMJDLQnjNCvWWpdjjdM", "crSwnwVnwSRBcNBNjjWCdC",
            "GlbTGbsSzrtbmbfhnJQP", "fDLSWVDRHHfVWHgPcZlDlZbbQhBcZQbb", "jrmFmprTpFztmddjdjrpvBQlQZGhQbTsQbGcQbcbQs",
            "nvqdpmjFnwpLSWlfnVNnWl", "nZBRbBJzznNNCnJZwnBSCJMcpcTpcwhcqhmsmWMwFWLL", "jQfvjgtfvPlHHqWpvWThpWqWch",
            "VljjjgjQjrTDlDgrHtVCbnJZzNzNbnRNNJZrJR", "MQtJnttlMLlJQsNhQrVVrFVWRRbbVFdJDD",
            "vGjvzmjzgHqSjjSzmSGHTWbfDFWrbFzFfdDVrfRWDb", "qPRqvTSPggqGgHCmllnCNLtnhcnnsnnw",
            "zrlZsQMFrsgQFMMjMCbjVDCTCW", "NqHNRdBppcJJcTpdmRfHThpdDWDtvbWVtbLjWbttWqqCCbLt",
            "mhJpJHTJmBhcJhwhgwzsQwSSlzQQzGlZ", "TvsszlvnzRRVTqzVrqrjjZGPfQPFqPqG",
            "mcNhDNchppWmWSNhdSmSCQNjPFjrfGjrgPFCrgFPgPgrLf", "SDddWpdMWSwNDmMNwlJRQwJlsVRRvzlsHt",
            "DTtggjsFFFTlPJhvctBqBqSRmSMBSRnmnRcm", "fGfwZdrbHVLdbGdHHwwQGVwBBCMMfvCNRNSMMMSRBmmRCN",
            "dGZzGHGVVbvHvHwbzpGbHLrwFDDFTtsglhFspgJshslTDJjT", "CbzspssWwCPcvvplrfqfDCJrDqdllB",
            "LjttnjNTNGgQQJdBrffTwB", "nVtLSgggjFwtMczhvzpZbSZW", "HCzCHHvWthWFHhssWCVmnqZrnqVrmrmgnbrqmN",
            "wPPGBjQQGwGbSlSLwgnpnrBZnBBmnMNnMN", "jTTbJlJjPPLPGHHTthhhHcFWTT",
            "qRdvvPDrCpzPHzcdrrcRqtbJJgjhgtWjJgbWJtgCFb", "GTwGwNscLllGTZmGSTZGlSBMnhggjbgtgbtbsgWFFMhbMF",
            "ZSQBSmlmzcrdQRqz", "cSpTRphwwghRfgSScqPpnDqDCjDjJJJJDvDLCvvn",
            "BVmmQFQBQVNBVmsWlbQFGBBlCHTJznzHLHvvCnjjNLHJDLHD", "MFsZZMbBGblbQTmQsFsQMMfPcPcwSpwtStgPphZtctPc",
            "QZbbZBdjPBjbQQbZnSSltlfwWvlvwNtNjwFMMN", "DLVqTJqpSVtfsptwfWpv", "rcRRVVTSbPQBPrBZ", "tjSgSjLFSnVjDWRsQj",
            "lcdqhfFpqZGpZqznrVRWPrnWRVBsVG", "FHddNNNHwTHMHvvS", "qCSDSQlwBHNbgJrHnLJH", "GRpRpRfnmRWWVWgVrF",
            "jhdZjpnvGfTZZQPlCtqQQSsS", "FMZSGWWBrZjMBZMrBWMGjjZDnCRqpgPnbRwPbFnvvqFnDR",
            "QHcpfVVslfdVlQclcctqRgqgbsCwbCwPCCCPwD", "NLHfLhclmmhdfNNpfQMBmZWBrJMmZWBzMrjj", "pBMpRgBMQwzRthmzLC",
            "HPcJvrvDbjvrFDcvWrHfHfWHmdddtdTLztmtdtfllmNdNhNz", "DvPFDvnPJLngQsggMGGQ",
            "BbcFHvbhhDbbTSvZmwwgJPPlDlZldd", "prCrNLMNgWWJBdrJ", "fQMLCfLLtpqsNNMnnfBhcBSVGbhhhcqVbcjc",
            "ZchcZZjmmNpgmJtgmM", "RLrHllWrQZQGlBpbGFGFFM", "RQnLHrqPLnZHzqjfVPcvVTfCvPTC",
            "fMtwjfMwrbjfGrtrpPGrwpNNVNVqcbdVqHZTFNbcHSNL", "mgzvDnJmnJhFJHSTNqZLHncHLS", "vRzhzslJFhRffPPQMjGtGl",
            "VMMNjWppQVwzNWrZdrrtMCMZCtMT", "ngDScLcvPPgDPDGhGDPGSHVbHTHmZtTSrBHZbZBmBb", "LhlglLghnVlplswJjs",
            "bGJQZZTQQLJJbQZlTZLjCGQTsDhWFhmshhvjWVFVVrgtDsst", "NScqwHcwwnnzBwqPqqsmVNhgsDDVtsghrFFg",
            "pcrcwnpcffrcBzfbCRLpRLMMRlRLQl", "hzCzCzpRgCzzzCctNsNWNqsZqZhPqNPb", "TdBwmdrrrDmvwTvqNsSRssPlsWsq",
            "FDBRRHDMTmBfmrmngnpjGgVptMgLCp", "ZPLLnSPMFGvFZMSvHhDhqHfqvfqbDW", "GgcppCgBcrQBBgplrVddhDqqqfdHgWdfqb",
            "CcCjQszmGBQjrcCwCmCccPwPTPnMPTnMJSMMRZSPJL", "LcVVcqqSHRLzRnCfNnGzNW", "LZPPdljlCggMjgNM",
            "PTvwlPtwtlJvZTQvbcHppFLHVVTcFssF", "fpWzvzNgWJBVfBJzWzBVJNzWbZcbHhlbthjlrrPrjZZPHZhJ",
            "hRDmGCFDwQnStncrjnccHcMP", "GmmsGRmFTsFwSCsRQDsCSqqpfvfgzddWggvqdpfBWzVh",
            "wjRBFljJGDFwwlGGpBSjGDtwTVtTgHHHsHHsVTVzsHqq", "CPLNPdbWvbMWbcmvPNdLVqtsHqgCqHChZhhsVsHt",
            "PWcPfPvmvNQbbWdWpJjJBDptGnDFjftn", "mFFmJpDMmmnJFjWDVclsSpcflSsQwSsc", "HrjNNjHNfVwLNSSl",
            "tdZbhjHZHPbdCTvbbhhrGbbHMFmRMvnRRFmmvJMDmgJDJMnq", "szJZhshbsfZJjbttchPctdTnWnRWVWMMnBdLRpMnBz",
            "SrNwvDSwrCmnVRvjpWLBBn", "ggGmgNFrgSDwmNgrCmtPsZPsjQGsqPcsqqJP", "gjSWSjJSWrWzppzW",
            "MCMzHNGNqHfscsFtrtwscVcr", "qGHNGNHLCnLmTCHfMMmNTzzldzgJlJZZgJljgTdD",
            "QGTQtQzTmdTsGTLcdFTGzdtBBjtwvBBJDvDMHJgjJvww", "lPlqsZWnDJjZvZgV", "ShCfCRnWGFsRRRrF",
            "lwGtndCrrmGCwdmhzQrBzrHvLVggPgHv", "fjMjDZJqSDJfJqDNDjJffjZLHPHHFvVFzHBLgLFpFpBSgL",
            "MsTZWRNZfJZZqMGVGhhlhhccRnhC", "MMvncqvcHcSnsdzzgvdfQjpljpQVTdDQDRTRlVpQ", "wLCrNtBFFHHThRlH",
            "bPJtHmCWssqgGPvq", "LvTLsmDWvTWqTsmqjRTmjwgdwgnMHMMFgdtHmBmFVn", "rlSCJzCSfpGGlhznQdnwFhtHgBFwtV",
            "SGZJJSSrVfCbGJLjPsWbvjRsPTqR", "pNqVVDCMVMBpqJVdMNHrccGHrtNtTFFFrQ", "hwmllWbvvbnPvbSvtrFhhJzzHztcTztT",
            "WSnbnPbbbvlWlRvnsqqMgLRMjLgVLCJdRV", "GphVTGVMtQwtJmtCJP",
            "FRRsBBsFqRNZNNrgqBdRfCZvbmPgmQzJQPnmJbJmQPJPPmwj", "RNqsFrRfZZsZWvNqWRFvrBZvWhhCGVplhlWTlTpSCLpMhWMD",
            "RZRjgbZHjjhsSnRsZstDRStsTVpFhBqFphMqPPpTFQVMPFTM", "zrcGJwNNdwJrfNdJWvGdJzdTlTFlqTVPFTVFPPBpqNTbBP",
            "WwLdLGfrRLStCZbD", "mrmTqJWTvDDppTDb", "DGzBfCzNDzdMwnLlbn", "FVZPFZFFZPgjmWZsDtsq",
            "TpnFTnFRCgRgldMRnDnRcrcdbdPBHbtPqbVcccrH", "WNWLfQQmfhhSNwmrcbSVqPtbZDZcPb", "LQhwLQvQvNfJhJRDMGFRlCMDMD",
            "vLFTDmjVvLgnNHPphN", "lMClGCmsRdCnPzCccngCpz", "dlGZwRsRrRwswGsdSbbZSbVDrVBmDWWWFJrTrFvFTmqV",
            "SGsZRqGLWLLtZRHRRcLHGTlJjzgJpjzTpNTNJNWpTm", "MPMPvFFvFBrPPDPMQMPChjgpNpSNTmmmpNlTDljlTz",
            "vnhrvMvnhSRqqLqnfn", "mGFrlBmFQNQFljhqqqqbmHMsTPRbWWCsLMWRsb",
            "wnwtvpwVzDVpvzzwZppnctMLtMPWWCstTsWTsTLffRRW", "vwDJgZnvZJFqgLBFGqgl",
            "QdGltnWNWqTdqQWvWsMJcrTcFcrgshJRMs", "BzPLCDPzzzzCCLLfCBzfSDmLMrDJMglrcRbbhRsFhMrRJcsM",
            "fjSzwwHfSzPzfCVBHlpdjGnZqnZptqQWjGvG", "VbJZbgVzvzmhQpQWpQzhDp",
            "tHPPcGcFBlCctCGtGcBBNlDLMGfMLwWfwwqMLLJwQWwp", "dCHTPTPJdTBFPdrZjgsjrjnmdgms", "JJpBvJQBZVvcFqqnsWdWvjsn",
            "DCfbDbTtbgfCSHqqNdFMPhPDFnPPDWsPjM", "bTmzTNCTNmfqTgJQcpLrpZLzVlVL", "dtTLntTjzTftnmwnqGGQHNmm",
            "SWbShCPMBgBRRFSFtRZZmm", "DlJPCJCgPWhttzpvdjcpVl", "WdzsNvWMzNsMHWddWCVffqmSmScLPvLPgLgLPplrrPmL",
            "BtnzbnBhbwttwtZlmmlgcwSrLgmmpm", "bFhQtbGBTnjBBbjTtFBbVDzddDDfjdDDqNWVjWHj", "ppmtpgLLZLCbMQvQQThdtrvPhV",
            "BBlHBwHRjHqBzzbHHqjjQdDQTDhPQDvnQlrQDQvr", "HGjFzwHNczbzRFcGzHGFSJSpspsmpssMLLSZCppmfs",
            "MpGrMMMcTsHMVHcvbwwmmcRSmDmDmv", "zCNptqCBQQLCNLCzbfvSvbSzSDRDSmSv",
            "CNNqNgNQJNgQtCqLlllZdZhTrThsnHpVVssPTsGP", "jhSGcShDrLcLLFcw", "MVzQvQNZVLHvHPdhLW",
            "qzhhQlVbgqjmSjJDsgmR", "CFzSPCgcsVVzFgzSCsBJwjdwJtNllnwglJlp", "QrvbqWvvLbmvDMMmbdwFWpNNwwwwptjJWn",
            "RZRZZqvvvDbDHCRTGchHFSGG", "SszgPSPPVltDlqtz", "WfTdTBdQdFnWBBBhBhNjVJtpNsVlDDDHHJWp",
            "hQhrLFsBwdQPggbRgPwRMg", "frRppMMDMpDnJfprnZhrrhpzWgvvGCvvFzWFvzvVVWFGJB",
            "TcmLwTsccqwqbPwsdwqdTPSvBvzzztvggVvQCGWQCLBvCv", "sswNjscwmqjwSssjdZNMfHHlHhfrnrgnfR",
            "JpBJBdmdzZzzpngmbCnlqnNbNM", "MMTHGccLTLvwRMlRnnQnbblnRnSs", "vVGtvMcjLVGHfHDrPPWZppBpJpfZZZ",
            "FGJtlttPdPtGFldlPRGpJTVzSBSSggHgJjVmBMHjJm", "rhbvqrQLrWqrWLLfqbjjgNmVNSgzTmNgNS",
            "hsffZQqnqCfZzlPPGlRlcwDs", "HDDdZpcFwHFRFcZqDctpRDHpwTCVwjrBTQTBLBLBJJBjjQTJ", "ldlMzhlPshPbLrrVrQQCMQjB",
            "glzNfWlvbHqSdNNNcF", "jZCMtnZZHCZwBWMwCwtMmfPFfvHDvzHFLPmFDfvh", "RcrQdRRdGTzGvDGmfgjh",
            "TsQscdQsQNTNqQQpRrRVCCBMMJJWMMVNVjnNJM", "zVPWhVzLzWBWHZnlqBllqlpRbGNdffscGNdbDRnNSfcG",
            "MtvSFQQwMcpsGRNGFR", "vvTwJJSgmCSMmjVPPJWWhzllWLVV", "RjdfnJfmbVvVJVFQcs", "rZDZGBBZVvLZLHFW",
            "qPzTDPlVrjNgfCdmPd", "bcjmQPrnbmVmsLVrLrjmcHGRWlZHHRwHpZRHWWwH", "nFhqzFqJzDJfvfSFqFfGHWZZHGRJRWHZWdpWwZ",
            "hBCtDSSFCTqCCFzSnzMrLNmrMNPTNMQPMmNL", "qvNBSJVDJGGVSJbVDDVhDbbqPjpWpWzWrnpWvvWPMjnWnpWz",
            "mlTltwcwMWTPfNTN", "CtCwFmCgmcmlRFmFCtRCHgmDJsbBhVqsbBHVDbNHDHJqqb",
            "csBFBsLrBGBWcgLcBvRgpRhbwRwlbQwbwQgD", "DCqmDmtTRtRlhdlh", "qnCmTNPmmCnSSzmzNzGLzLccGDBzGrBLvvcW",
            "FjfBjHnHzPFwhvFFqh", "bjRpGsNsPqQvPclb", "NWGGWGrrZVZjsCLmDMMgzgrSnzSm",
            "MDgmmsNCmZMWmHCZLrvnLBBjPLVlPVbW", "zcJGQwJdFRnrBVzqzvPr",
            "hTQwhJwcfTFddFdGSfcRQQGFsggsgsHHnSmgsgsmgCnHNZpC", "BPfwzfsgsvfszvBRbQpttRVpJbJpVg",
            "LhTmHLbmbcFTFrWCbFqhFHLHVRpVtQpZVVDVprnDMJtJQnVZ", "TGWWbTFFGTqlHhqhSdNdNfNSldjjBfjv",
            "zCzpWTccHlWcPzMljMttbJfjmlfm", "DqqQVZZqVsqJnbbnmjbJJQ", "ZRmDZsSgVmGLsVqsLDFvrcccHrcTWCgWHBCHcCWp",
            "cvGlQMtQlPtQWWMlcGsrFwFdbgdbdGGDCDCwdd", "VChVZNBVjTTfhNTFgzrzrJgSdzgzwf",
            "THThZTqZRHZRqNVZNTVLjRCMmQsntQctMnsPmMmMcWtLMQ", "pNRHrbNlNnRLNpMMMTrcGcGTcccz",
            "ZttBmsJmZdjsvTTvvdBMjDhfMGWGDfDfcScjfD", "CmtTtwvtCsgllNHPPFbLpC",
            "NpQcvwwRHvdfRvQsNfBQNvfRhVmVMqsZMmMshjMMtWZtMmrm", "CGHbSSzFLSSHzTnbLnCWMrtWMtjnZMhZrqZtqW",
            "FzCPPzLbPgFJbHSPldNRpgNfvvccgvwf", "nSjpnnhNchMQZMSScnshshncJCGwHGClwmHPZlJPTVZCwHJf",
            "LvtzBTgLWgLPlPwHPLPJ", "dTBDqRqFzzhQFhshhNhM", "HjjdPsjnllHsbnnDnbTBzLBFBZLLpRFRcCHRFz",
            "wqqWwQhQQMCQffqqhtwMGhpZFRRZvzWzFvBvpvmcRvZm", "fGfghtNhthqJrQqMqMMSgDdbPjbssDbdSnjCdd",
            "cqPwJJnnffBFqSfJFnDDPVplLdglGgLVjzGLdVSzVt", "WHRTWNHsQTNbzsbCbTsvWrWtjlgVdLgLdvdgvmLjpGlgtm",
            "ZMQrTbNHZNsHHrQCZrNDFzhwnMJcfnDhJPPPFh", "LRCFbjNjbCZDmtmqmRRmLtFJBgWBBpvJMwBJvGjBBvMBgw",
            "TTrlfHzccVllZhdQgdGMJWvgWgBndwpG", "fVSshSVlsfslhsSHHSZtZZNmNFmtmbFCDF",
            "SPGCBPDMtbcbCtchSMccDTTrrrTFTrsrMTWHTHFVWF", "JmnzqVmmwwfpJpmdHRTRsdsTrFdrQp",
            "LqwLgzJgnjqLwgGcVbtjDGjcVbhv", "PQcMvrvMsvmdSPPVccmSJcSpGBWWWbBHfWWnfttJWnWJpJ",
            "wDzqhjzmqRzDRwqDzNDbWtjWBBBtGbtHpHnnBf", "zglRhDqqDZgRNmZQVCdcCPQvvdZv", "RpVjRgvFjGBNWtBWFDtt",
            "dcqQwlqMMsCLLfbgQmtD", "snlgzsggTzSTSJTr", "dLHhDdtlMngFcFsFLFzzsj",
            "vWRGGRVrrWvvGQQJBRsmQzmsqnffqcNfNcfz", "vSRVJBVBwTvWTnHphTgDgtMpDl", "bvvGnnJbfPmfdgJJSVtwwCpTScVfNpSC",
            "sjsZWDqBqqMRZsDjbWMVwtwNNcNtScRHpRRttp", "hzhDqqWDzZzDZzZLQPJPdPnPvlrbGdlnFQ",
            "PwWHTwzFvNHsNzmmMwzNWGQrCqCFjpZbpnGqrqnpbr", "gRVRgJRJlDLSJddDccQVrtZnCqjndnrZdnqnqpdq",
            "chhgSSJfQhRRcSSSSBLVfzmzHTNzMNsTNWHMMvMP", "lftqSpBSvhlDBDlhBSczQGmcFMcMVVFMmGFWsm",
            "rHLHTNdggsLLnwLHbTTgdrTMPPmMGWZGQQMzQVQFZQGM", "gbJnrHHjnbrgLrRrHpBJvSBDDsfJsDtstq",
            "dBTtFLTtVmpdLhMprSRSWMRSMR", "QvJvQbjbCgCQRBhzzRsNWNBC",
            "bjgGqQGbQnjGQgnQgbGgjJnDLHLdfPVtdDmLZdBFVVZttdTf" };

    public static String[][][] split() {
        String[][][] splittedIput = new String[input.length][][];
        for (int i = 0; i < input.length; i++) {
            String[] firstCompartment = input[i].substring(0, input[i].length() / 2 - 1).split(" ");
            String[] secondCompartment = input[i].substring(input[i].length() / 2, input[i].length() - 1).split(" ");
            String[][] splittedString = { firstCompartment, secondCompartment };
            splittedIput[i] = splittedString;
        }
        return splittedIput;
    }

    public static String findTheString() {
        String[][][] splittedIput = split();
        for (int i = 0; i < splittedIput.length; i++) {
            for (int j = 0; j < splittedIput[i].length; j++) {

            }
            ;
        }
        return "S";
    }

    public static void main(String[] args) {
        System.out.println(findTheString());
    }
}
