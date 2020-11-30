
@XmlJavaTypeAdapters({ @XmlJavaTypeAdapter(type = String.class, value = NormalizedStringAdapter.class), })

package com.yjy.edu.enterprise.basic.packages;

import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
